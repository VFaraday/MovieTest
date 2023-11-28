package com.bobryshev.domain.usecase

import com.bobryshev.domain.AbsUseCase
import com.bobryshev.domain.AppGlobalException
import com.bobryshev.domain.NetworkResult
import com.bobryshev.domain.map
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.repository.MovieRepository
import javax.inject.Inject

class MovieDataUseCase @Inject constructor(
    private val movieRepository: MovieRepository
): AbsUseCase() {

    suspend operator fun invoke(movieId: String): NetworkResult<MovieData> = runOnBackground {
        movieRepository.getMoviesData().map {
            this.firstOrNull { it.movieId == movieId } ?: throw AppGlobalException.ResponseIsNull()
        }
    }
}