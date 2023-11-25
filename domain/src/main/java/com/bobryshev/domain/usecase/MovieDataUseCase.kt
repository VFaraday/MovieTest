package com.bobryshev.domain.usecase

import com.bobryshev.domain.AbsUseCase
import com.bobryshev.domain.model.MovieData
import com.bobryshev.domain.repository.MovieRepository
import javax.inject.Inject

class MovieDataUseCase @Inject constructor(
    private val movieRepository: MovieRepository
): AbsUseCase() {

    suspend operator fun invoke(movieId: String): MovieData? = runOnBackground {
        movieRepository.getMoviesData().firstOrNull { it.movieId == movieId }
    }
}