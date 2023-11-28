package com.bobryshev.movies.view.movielist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.bobryshev.domain.model.MovieOffer
import com.bobryshev.movies.R
import com.bobryshev.movies.utils.MovieRoute
import com.bobryshev.movies.utils.textStyle

@ExperimentalMaterial3Api
@Composable
fun MovieListScreen(
    viewModel: MovieListViewModel = hiltViewModel(),
    navHostController: NavHostController
) {
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = { Text(text = stringResource(id = R.string.movie_offers)) }
            )
        }
    ) {
        Box(modifier = Modifier.padding(it)) {
            if (uiState == null || uiState?.list?.isEmpty() == true) {
                EmptyState()
            } else {
                LazyColumn(
                    modifier = Modifier.padding(all = 10.dp)
                ) {
                    items(
                        items = uiState?.list.orEmpty(),
                    ) { item ->
                        MovieListItem(item) { id ->
                            navHostController.navigate(
                                MovieRoute.Details.route
                                    .replace("{movieId}", id)
                            )
                        }
                    }
                }
            }
        }


    }
}

@Composable
fun MovieListItem(
    item: MovieOffer,
    onItemClick: (String) -> Unit
) {
    val padding = Modifier.padding(10.dp)
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        modifier = padding
            .clickable { onItemClick(item.movieId) },
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(8.dp)),
                model = item.image,
                contentDescription = item.image,
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Text(
                    text = stringResource(id = R.string.is_available, item.available.toString()),
                    style = textStyle
                )
                Text(
                    text = stringResource(id = R.string.price, item.price),
                    style = textStyle
                )
            }
        }
    }
}

@Composable
fun EmptyState() {

}