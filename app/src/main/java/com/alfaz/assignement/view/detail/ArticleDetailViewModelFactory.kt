package com.alfaz.assignement.view.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alfaz.assignement.interfaces.UIEventHandler

class ArticleDetailViewModelFactory(private val eventHandler: UIEventHandler) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ArticleDetailViewModel::class.java)) {
            return ArticleDetailViewModel(
                eventHandler
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}