package com.bobryshev.domain.model

data class MovieOffer(
    val price: String,
    val image: String,
    val available: Boolean,
    val movieId: String
)