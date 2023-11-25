package com.bobryshev.movies.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<State: UIState>: ViewModel() {

    private var _uiState = MutableStateFlow<State?>(null)
    val uiState = _uiState.asStateFlow()

    abstract fun handleUiEvent(event: UIEvent)
}