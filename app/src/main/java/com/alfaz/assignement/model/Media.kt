package com.alfaz.assignement.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Media(
    @SerializedName("approved_for_syndication")
    val approvedForSyndication: Int, // 1
    @SerializedName("caption")
    val caption: String,
    @SerializedName("copyright")
    val copyright: String, // Kholood Eid for The New York Times
    @SerializedName("media-metadata")
    val mediaMetadata: List<MediaMetadata>,
    @SerializedName("subtype")
    val subtype: String, // photo
    @SerializedName("type")
    val type: String // image
): Serializable