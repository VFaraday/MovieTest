package com.bobryshev.movies.view.movielist

import com.bobryshev.movies.base.UIEvent

sealed interface MovieListUiEvent: UIEvent

data class NavigateToDetails(val movieId: String): MovieListUiEvent