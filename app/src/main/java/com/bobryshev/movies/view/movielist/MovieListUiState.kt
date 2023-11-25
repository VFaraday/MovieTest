package com.bobryshev.movies.view.movielist

import com.bobryshev.domain.model.MovieOffer
import com.bobryshev.movies.base.UIState

data class MovieListUiState(
    val list: List<MovieOffer> = listOf()
): UIState