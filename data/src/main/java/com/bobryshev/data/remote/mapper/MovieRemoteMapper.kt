package com.bobryshev.data.remote.mapper

import com.bobryshev.data.remote.model.MovieDataItem
import com.bobryshev.data.remote.model.MovieOffer
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer as MovieOfferDomain

object MovieRemoteMapper {

    fun MovieOffer.toDomain(imageBase: String) = MovieOfferDomain(
        price = price,
        image = imageBase + image,
        available = available,
        movieId = movieId
    )

    fun MovieDataItem.toDomain() = MovieData(
        movieId = movieId,
        title = title,
        subTitle = subTitle
    )
}