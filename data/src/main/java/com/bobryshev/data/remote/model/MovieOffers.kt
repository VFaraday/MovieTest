package com.bobryshev.data.remote.model

import com.google.gson.annotations.SerializedName

data class MovieOffers(
    @field:SerializedName("image_base")
    val imageBase: String,
    @field:SerializedName("movie_offers")
    val movieOffers: List<MovieOffer>
)