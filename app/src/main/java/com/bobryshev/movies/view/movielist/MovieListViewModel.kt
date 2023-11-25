package com.bobryshev.movies.view.movielist

import androidx.lifecycle.ViewModel
import com.bobryshev.domain.usecase.MovieOffersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    movieOfferUseCase: MovieOffersUseCase
): ViewModel() {
}