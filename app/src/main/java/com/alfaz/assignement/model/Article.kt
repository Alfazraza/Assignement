package com.alfaz.assignement.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Article(
    @SerializedName("copyright")
    val copyright: String, // Copyright (c) 2021 The New York Times Company.  All Rights Reserved.
    @SerializedName("num_results")
    val numResults: Int, // 20
    @SerializedName("results")
    val articleItems: List<ArticleItem>,
    @SerializedName("status")
    val status: String // OK
): Serializable