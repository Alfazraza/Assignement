package com.alfaz.assignement.interfaces

import android.view.View
import com.alfaz.assignement.model.ArticleItem

/**
 * To pass UI events to activity
 */
interface MoreInfoClickHandler {

    /**
     * Will be called when more info link gets clicked
     */
    fun onMoreInfoClicked(view: View, articleItem: ArticleItem)

}