package com.bobryshev.data.remote.model

import com.google.gson.annotations.SerializedName

data class MovieDataItem(
    @field:SerializedName("movie_id")
    val movieId: String,
    @field:SerializedName("title")
    val title: String,
    @field:SerializedName("sub_title")
    val subTitle: String
)