package com.alfaz.assignement.view.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alfaz.assignement.interfaces.UIEventHandler

class ArticleListViewModelFactory(private val eventHandler: UIEventHandler) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ArticleListViewModel::class.java)) {
            return ArticleListViewModel(
                eventHandler
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}