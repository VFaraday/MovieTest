package com.bobryshev.movies.view.movielist

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@ExperimentalMaterial3Api
@Composable
fun MovieListScreen(
    uiState: MovieListUiState
) {
    val items =
    Scaffold {
        TopAppBar(title = {
            Text(text = "MovieList")
        })
        LazyColumn(
            modifier = Modifier.padding(it)
        ) {
            items(uiState.list) {

            }
        }
    }
}