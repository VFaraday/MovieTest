package com.bobryshev.data.repository

import com.bobryshev.data.dataSource.MoviesDataSource
import com.bobryshev.domain.NetworkResult
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.model.MovieOffer
import com.bobryshev.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val moviesDataSource: MoviesDataSource
): MovieRepository {

    override suspend fun getMovieOffers(): NetworkResult<List<MovieOffer>> {
        return moviesDataSource.getMovieOffers()
    }

    override suspend fun getMoviesData(): List<MovieData> {
        return moviesDataSource.getMovieData()
    }

}