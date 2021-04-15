package com.alfaz.assignement.retrofit

import com.alfaz.assignement.model.Article
import retrofit2.http.GET

interface ApiService {
    @GET("7.json?api-key=YOhfHb2WMOQxng175fFAgMkrlyHFEoVG")
    suspend fun getList(): Article

}