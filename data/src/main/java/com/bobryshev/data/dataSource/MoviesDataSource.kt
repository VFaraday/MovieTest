package com.bobryshev.data.dataSource

import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer

interface MoviesDataSource {

    suspend fun getMovieOffers(): List<MovieOffer>

    suspend fun getMovieData(): List<MovieData>
}