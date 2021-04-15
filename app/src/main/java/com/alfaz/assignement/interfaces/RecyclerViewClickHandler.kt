package com.alfaz.assignement.interfaces

import com.alfaz.assignement.model.ArticleItem


interface RecyclerViewClickHandler {
    fun onRecyclerViewItemClick(article: ArticleItem)
}