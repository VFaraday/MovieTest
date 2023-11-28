package com.bobryshev.movies.utils

sealed class MovieRoute(val route: String) {
    object Home: MovieRoute(Constants.MOVIE_LIST_SCREEN)
    object Details: MovieRoute(Constants.MOVIE_DETAILS_SCREEN)
}