package com.bobryshev.domain.repository

import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer

interface MovieRepository {

    suspend fun getMovieOffers(): List<MovieOffer>

    suspend fun getMoviesData(): List<MovieData>
}