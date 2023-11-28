package com.bobryshev.movies.view.movieDetail

import androidx.lifecycle.SavedStateHandle
import com.bobryshev.domain.onError
import com.bobryshev.domain.onSuccess
import com.bobryshev.domain.usecase.MovieDataUseCase
import com.bobryshev.movies.base.BaseViewModel
import com.bobryshev.movies.base.UIEvent
import com.bobryshev.movies.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val movieDetailUseCase: MovieDataUseCase,
    savedStateHandle: SavedStateHandle
): BaseViewModel<MovieDetailUiState>() {

    private val movieId: String = checkNotNull(savedStateHandle[Constants.MOVIE_ID_ARG])

    init {
        loadData()
    }

    private fun loadData() {
        launch {
            movieDetailUseCase.invoke(movieId)
                .onSuccess {
                    updateState { currentState ->
                        currentState.value = MovieDetailUiState(it)
                    }
                }.onError { code, message ->

                }
        }

    }
    override fun handleUiEvent(event: UIEvent) {

    }

}