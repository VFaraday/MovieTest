package com.bobryshev.domain

import kotlin.Exception

sealed class AppGlobalException(cause: Throwable?): Exception(cause) {

    /**
     * User has lost the appropriate permission to perform action within the workspace.
     * (example: user role within workspace has been changed from Admin to Explorer)
     */
    class Forbidden(cause: Throwable?) : AppGlobalException(cause) {
        companion object {
            const val ERROR_CODE: Int = 403
        }
    }

    /**
     * Error due to call to unknown or deleted object.
     * (example: user has been attempted to retrieve data that has been removed)
     */
    class PageNotFound(cause: Throwable?) : AppGlobalException(cause) {
        companion object {
            const val ERROR_CODE: Int = 404
        }
    }

    class ResponseIsNull(cause: Throwable? = null) : AppGlobalException(cause)

    class Unknown(cause: Throwable? = null) : AppGlobalException(cause)

    class NoInternetConnection(cause: Throwable? = null) : AppGlobalException(cause)
}