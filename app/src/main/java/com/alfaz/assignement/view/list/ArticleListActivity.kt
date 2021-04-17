package com.alfaz.assignement.view.list

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.alfaz.assignement.adapters.ArticleDataAdapter
import com.alfaz.assignement.interfaces.RecyclerViewClickHandler
import com.alfaz.assignement.interfaces.UIEventHandler
import com.alfaz.assignement.R
import com.alfaz.assignement.databinding.ActivityMainBinding
import com.alfaz.assignement.model.ArticleItem
import com.alfaz.assignement.view.detail.ArticleDetailActivity
import kotlinx.android.synthetic.main.activity_main.*

class ArticleListActivity : AppCompatActivity(),
    UIEventHandler,
    RecyclerViewClickHandler {

    private lateinit var viewModel: ArticleListViewModel
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(
            this@ArticleListActivity,
            R.layout.activity_main
        )
        binding.lifecycleOwner = this
        val viewModelFactory =
            ArticleListViewModelFactory(this)
        viewModel = ViewModelProvider(this, viewModelFactory).get(ArticleListViewModel::class.java)

        loadData()
    }


    private fun setDataToRecyclerView(userList: List<ArticleItem>) {
        rvMostViewedArticle.also {
            it.layoutManager = LinearLayoutManager(this@ArticleListActivity)
            it.setHasFixedSize(true)
            it.adapter =
                ArticleDataAdapter(userList, this)
        }
    }

    private fun loadData() {
        viewModel.loadDataFromWeb().observe(this, Observer {
            setDataToRecyclerView(it.articleItems)
        })
    }

    override fun showToast(text: String) {
        Toast.makeText(applicationContext, text, Toast.LENGTH_LONG).show()
    }

    override fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }

    override fun onRecyclerViewItemClick(article: ArticleItem) {
        val intent = Intent(this, ArticleDetailActivity::class.java)
        intent.putExtra("article_item", article)
        startActivity(intent)
    }


}
