package com.bobryshev.domain.repository

import com.bobryshev.domain.NetworkResult
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer

interface MovieRepository {

    suspend fun getMovieOffers(): NetworkResult<List<MovieOffer>>

    suspend fun getMoviesData(): NetworkResult<List<MovieData>>
}