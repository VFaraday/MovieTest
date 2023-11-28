package com.bobryshev.movies.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlin.coroutines.EmptyCoroutineContext

abstract class BaseViewModel<State: UIState>: ViewModel() {

    private var _uiState = MutableStateFlow<State?>(null)
    val uiState: StateFlow<State?> = _uiState.asStateFlow()

    private val handler = CoroutineExceptionHandler { _, throwable ->
        updateErrorState(throwable)
    }

    protected fun updateState(block: (currentState: MutableStateFlow<State?>) -> Unit) {
        block.invoke(_uiState)
    }

    abstract fun handleUiEvent(event: UIEvent)

    protected fun launch(
        block: suspend CoroutineScope.() -> Unit
    ) = viewModelScope.launch(context = EmptyCoroutineContext + handler, block = block)

    private fun updateErrorState(throwable: Throwable) {
        updateState { state ->
            state.value = null
        }
    }
}