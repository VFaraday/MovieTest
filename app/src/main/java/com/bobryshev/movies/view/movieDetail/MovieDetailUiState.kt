package com.bobryshev.movies.view.movieDetail

import com.bobryshev.domain.model.MovieData
import com.bobryshev.movies.base.UIState

data class MovieDetailUiState(
    val data: MovieData
): UIState