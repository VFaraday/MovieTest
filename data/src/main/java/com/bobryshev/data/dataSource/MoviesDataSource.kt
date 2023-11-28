package com.bobryshev.data.dataSource

import com.bobryshev.domain.NetworkResult
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer

interface MoviesDataSource {

    suspend fun getMovieOffers(): NetworkResult<List<MovieOffer>>

    suspend fun getMovieData(): NetworkResult<List<MovieData>>
}