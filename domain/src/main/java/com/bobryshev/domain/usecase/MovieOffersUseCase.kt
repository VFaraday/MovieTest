package com.bobryshev.domain.usecase

import com.bobryshev.domain.AbsUseCase
import com.bobryshev.domain.NetworkResult
import com.bobryshev.domain.model.MovieOffer
import com.bobryshev.domain.repository.MovieRepository
import javax.inject.Inject

class MovieOffersUseCase @Inject constructor(
    private val movieRepository: MovieRepository
): AbsUseCase() {

    suspend operator fun invoke(): NetworkResult<List<MovieOffer>> = runOnBackground {
        movieRepository.getMovieOffers()
    }
}