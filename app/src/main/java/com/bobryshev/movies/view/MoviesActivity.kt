package com.bobryshev.movies.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bobryshev.movies.utils.Constants
import com.bobryshev.movies.utils.MovieRoute
import com.bobryshev.movies.view.movieDetail.MovieDetailScreen
import com.bobryshev.movies.view.movielist.MovieListScreen
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalMaterial3Api::class)
@AndroidEntryPoint
class MoviesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MoviesApp()
            }
        }
    }

    @Composable
    private fun MoviesApp() {
        val navController = rememberNavController()
        MovieNavHost(navController = navController)
    }

    @Composable
    fun MovieNavHost(
        navController: NavHostController
    ) {
        NavHost(navController = navController, startDestination = MovieRoute.Home.route) {
            composable(route = MovieRoute.Home.route) {
                MovieListScreen(navHostController = navController)
            }
            composable(
                route = MovieRoute.Details.route,
                arguments = listOf(navArgument(Constants.MOVIE_ID_ARG) { type = NavType.StringType})
            ) {
                MovieDetailScreen()
            }
        }
    }
}