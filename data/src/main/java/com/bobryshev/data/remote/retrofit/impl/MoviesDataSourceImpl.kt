package com.bobryshev.data.remote.retrofit.impl

import com.bobryshev.data.dataSource.MoviesDataSource
import com.bobryshev.data.remote.handleApi
import com.bobryshev.data.remote.mapper.MovieRemoteMapper.toDomain
import com.bobryshev.data.remote.retrofit.service.MovieApi
import com.bobryshev.domain.NetworkResult
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer
import javax.inject.Inject

class MoviesDataSourceImpl @Inject constructor(
    private val movieApi: MovieApi
): MoviesDataSource {

    override suspend fun getMovieOffers(): NetworkResult<List<MovieOffer>> {
        return handleApi(
            execute = { movieApi.getMovieOffers() },
            mapper = { response ->
                val baseImageUrl = response.imageBase
                response.movieOffers.map { it.toDomain(baseImageUrl) }
            }
        )
    }

    override suspend fun getMovieData(): NetworkResult<List<MovieData>> {
        return handleApi(
            execute = { movieApi.getMovieData() },
            mapper = { response ->
                response.movies.map { it.toDomain() }
            }
        )
    }
}