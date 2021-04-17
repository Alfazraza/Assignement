package com.alfaz.assignement.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.alfaz.assignement.R
import com.alfaz.assignement.databinding.ItemArticleBinding
import com.alfaz.assignement.model.ArticleItem
import com.alfaz.assignement.interfaces.RecyclerViewClickHandler

class ArticleDataAdapter (
    private val article: List<ArticleItem>,
    private val handler: RecyclerViewClickHandler
) : RecyclerView.Adapter<ArticleDataAdapter.ArticleViewHolder>(){

    override fun getItemCount() = article.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
        ArticleViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.context),
                R.layout.item_article,
                viewGroup,
                false
            )
        )

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.itemArticleBinding.articleItem = article[position]
        if(article[position].media.isNotEmpty()) {
            holder.itemArticleBinding.mediaMetadata = article[position].media[0].mediaMetadata[0]
        }
        holder.itemView.setOnClickListener {
            handler.onRecyclerViewItemClick(article[position])
        }
      //  holder.itemArticleBinding.ivItemImage.setImageResource(article[position].media[0].mediaMetadata[0].url)
//        holder.companyItemBinding.buttonBook.setOnClickListener {
//            listener.onRecyclerViewItemClick(holder.companyItemBinding.buttonBook, article[position])
//        }
//        holder.companyItemBinding.layoutLike.setOnClickListener {
//            listener.onRecyclerViewItemClick(holder.companyItemBinding.layoutLike, article[position])
//        }
    }


    inner class ArticleViewHolder(
        val itemArticleBinding: ItemArticleBinding
    ) : RecyclerView.ViewHolder(itemArticleBinding.root)



}