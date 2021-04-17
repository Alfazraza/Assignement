package com.alfaz.assignement.view.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.alfaz.assignement.repository.AppRepository
import com.alfaz.assignement.interfaces.UIEventHandler
import java.io.IOException

class ArticleListViewModel(private val eventHandler: UIEventHandler) : ViewModel() {
    private val repository = AppRepository()

    fun loadDataFromWeb() = liveData {
        try {
            eventHandler.showProgressBar()
            val receivedData = repository.getList()
            eventHandler.hideProgressBar()
            if(receivedData.status!="OK") {
                eventHandler.showToast("Sorry something went wrong. Please try again after sometime.")
            }else {
                eventHandler.showToast("All articles are loaded")
            }
            emit(receivedData)
        } catch (e: IOException) {
            eventHandler.showToast("IOException")
            eventHandler.hideProgressBar()
        } catch (e: Exception) {
            eventHandler.showToast("Exception")
            eventHandler.hideProgressBar()
        }
    }
}