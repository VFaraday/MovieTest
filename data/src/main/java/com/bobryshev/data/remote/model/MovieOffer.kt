package com.bobryshev.data.remote.model

import com.google.gson.annotations.SerializedName

data class MovieOffer(
    @field:SerializedName("price")
    val price: String,
    @field:SerializedName("image")
    val image: String,
    @field:SerializedName("available")
    val available: Boolean,
    @field:SerializedName("movie_id")
    val movieId: String
)