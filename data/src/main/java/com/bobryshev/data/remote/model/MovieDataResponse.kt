package com.bobryshev.data.remote.model

import com.google.gson.annotations.SerializedName

class MovieDataResponse(
    @field:SerializedName("movie_data")
    val movies: List<MovieDataItem>
)