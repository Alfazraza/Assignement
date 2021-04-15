package com.alfaz.assignement.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ArticleItem(
    @SerializedName("abstract")
    val `abstract`: String, // I learned the hard way that no publicly traded company is a family.
    @SerializedName("adx_keywords")
    val adxKeywords: String, // Sexual Harassment;Workplace Hazards and Violations;Computers and the Internet;Content Type: Personal Profile;Google Inc
    @SerializedName("asset_id")
    val assetId: Long, // 100000007682575
    @SerializedName("byline")
    val byline: String, // By Emi Nietfeld
    @SerializedName("column")
    val column: Any, // null
    @SerializedName("des_facet")
    val desFacet: List<String>,
    @SerializedName("eta_id")
    val etaId: Int, // 0
    @SerializedName("geo_facet")
    val geoFacet: List<String>,
    @SerializedName("id")
    val id: Long, // 100000007682575
    @SerializedName("media")
    val media: List<Media>,
    @SerializedName("nytdsection")
    val nytdsection: String, // opinion
    @SerializedName("org_facet")
    val orgFacet: List<String>,
    @SerializedName("per_facet")
    val perFacet: List<String>,
    @SerializedName("published_date")
    val publishedDate: String, // 2021-04-07
    @SerializedName("section")
    val section: String, // Opinion
    @SerializedName("source")
    val source: String, // New York Times
    @SerializedName("subsection")
    val subsection: String,
    @SerializedName("title")
    val title: String, // After Working at Google, I’ll Never Let Myself Love a Job Again
    @SerializedName("type")
    val type: String, // Article
    @SerializedName("updated")
    val updated: String, // 2021-04-12 14:50:57
    @SerializedName("uri")
    val uri: String, // nyt://article/1d869058-af65-5df8-b6be-5ff351543e76
    @SerializedName("url")
    val url: String // https://www.nytimes.com/2021/04/07/opinion/google-job-harassment.html
): Serializable