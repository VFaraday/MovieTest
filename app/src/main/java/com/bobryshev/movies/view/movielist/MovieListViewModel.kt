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
    private val movieOfferUseCase: MovieOffersUseCase
): BaseViewModel<MovieListUiState>() {

    private fun loadData() {
        launch {
            movieOfferUseCase.invoke()
                .onSuccess { list ->
                    updateState { state ->
                        state.value?.let {
                            state.value = it.copy(list = list)
                        }
                    }
                }
                .onError { _, _ ->
                    updateState { state ->
                        state.value?.let {
                            state.value = it.copy(list = emptyList())
                        }
                    }
                }
        }
    }

    override fun handleUiEvent(event: UIEvent) {

    }
}