package com.alfaz.assignement.view.list

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.alfaz.assignement.repository.AppRepository
import com.alfaz.assignement.interfaces.UIEventManager
import kotlinx.coroutines.delay
import java.io.IOException

class ArticleListViewModel(private val eventManager: UIEventManager) : ViewModel() {
    private val repository = AppRepository()

    fun loadDataFromWeb() = liveData {
        try {
            eventManager.showProgressBar()
            val receivedData = repository.getList()
            eventManager.hideProgressBar()
            if(receivedData.status!="OK") {
                eventManager.showToast("Sorry something went wrong. Please try again after sometime.")
            }else {
                eventManager.showToast("All articles are loaded")
            }
            emit(receivedData)
        } catch (e: IOException) {
            Log.d("message #EEEEE", e.message.toString());
            eventManager.showToast("IOException")
            eventManager.hideProgressBar()
        } catch (e: Exception) {
            eventManager.showToast("Exception")
            eventManager.hideProgressBar()
        }
    }
}