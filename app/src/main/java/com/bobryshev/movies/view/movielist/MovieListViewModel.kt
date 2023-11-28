package com.bobryshev.movies.view.movielist

import com.bobryshev.domain.onError
import com.bobryshev.domain.onSuccess
import com.bobryshev.domain.usecase.MovieOffersUseCase
import com.bobryshev.movies.base.BaseViewModel
import com.bobryshev.movies.base.UIEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val movieOfferUseCase: MovieOffersUseCase,
): BaseViewModel<MovieListUiState>() {

    init {
        updateState { state ->
            state.value = MovieListUiState()
        }
        loadData()
    }

    private fun loadData() {
        updateState { state ->
            state.value = state.value?.copy(
                isLoading = true
            )
        }
        launch {
            movieOfferUseCase.invoke()
                .onSuccess { list ->
                    updateState { state ->
                        state.value?.let {
                            state.value = it.copy(list = list, isLoading = false)
                        }
                    }
                }
                .onError { _, _ ->
                    updateState { state ->
                        state.value?.let {
                            state.value = it.copy(list = emptyList(), isLoading = false)
                        }
                    }
                }
        }
    }

    override fun handleUiEvent(event: UIEvent) {

    }
}