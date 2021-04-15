package com.alfaz.assignement.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MediaMetadata(
    @SerializedName("format")
    val format: String, // Standard Thumbnail
    @SerializedName("height")
    val height: Int, // 75
    @SerializedName("url")
    val url: String, // https://static01.nyt.com/images/2021/04/02/opinion/02nitfeld2/02nitfeld2-thumbStandard.jpg
    @SerializedName("width")
    val width: Int // 75
): Serializable