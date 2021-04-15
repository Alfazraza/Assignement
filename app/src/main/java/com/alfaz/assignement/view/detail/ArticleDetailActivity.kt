package com.alfaz.assignement.view.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.alfaz.assignement.Adapters.ImageSliderAdapter
import com.alfaz.assignement.interfaces.MoreInfoClickHandler
import com.alfaz.assignement.R
import com.alfaz.assignement.databinding.ActivityArticleDetailBinding
import com.alfaz.assignement.model.ArticleItem
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_article_detail.*


class ArticleDetailActivity : AppCompatActivity(), MoreInfoClickHandler {

    private lateinit var  binding: ActivityArticleDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_detail)
        supportActionBar?.hide()
        binding = DataBindingUtil.setContentView(
            this@ArticleDetailActivity,
            R.layout.activity_article_detail
        )
        binding.lifecycleOwner = this
        binding.clickInfoListener = this
        binding.articleItem = intent.getSerializableExtra("article_item") as ArticleItem
        val articleItem = intent.getSerializableExtra("article_item") as ArticleItem
        if(articleItem.media.isNotEmpty()) {
            vpImageSlider.adapter =
                ImageSliderAdapter(articleItem.media[0].mediaMetadata)
            TabLayoutMediator(tlInidicator, vpImageSlider)
            { tab, position -> }.attach()
        }else{
            ivDefaultImage.visibility=View.VISIBLE
        }
    }

    override fun onMoreInfoClicked(view: View, articleItem: ArticleItem) {
        val uris = Uri.parse(articleItem.url)
        val intents = Intent(Intent.ACTION_VIEW, uris)
        val b = Bundle()
        b.putBoolean("new_window", true)
        intents.putExtras(b)
        startActivity(intents)
    }
}
