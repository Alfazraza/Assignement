package com.alfaz.assignement.repository

import com.alfaz.assignement.model.Article
import com.alfaz.assignement.retrofit.ApiService
import com.alfaz.assignement.retrofit.RetrofitInstance


class ArticleRepository {
    private var service: ApiService = RetrofitInstance.appService

    suspend fun getList(): Article = service.getList()
}