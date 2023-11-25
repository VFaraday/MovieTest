package com.bobryshev.data.remote.retrofit.impl

import com.bobryshev.data.dataSource.MoviesDataSource
import com.bobryshev.data.remote.mapper.MovieRemoteMapper.toDomain
import com.bobryshev.data.remote.retrofit.service.MovieApi
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer
import javax.inject.Inject

class MoviesDataSourceImpl @Inject constructor(
    private val movieApi: MovieApi
): MoviesDataSource {

    override suspend fun getMovieOffers(): List<MovieOffer> {
        val response = movieApi.getMovieOffers()
        val baseImageUrl = response.imageBase
        return response.movieOffers.map {
            it.toDomain(baseImageUrl)
        }
    }

    override suspend fun getMovieData(): List<MovieData> {
        return movieApi.getMovieData().movies.map {
            it.toDomain()
        }
    }
}