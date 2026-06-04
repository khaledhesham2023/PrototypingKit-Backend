package com.khaledamin.enums


sealed class NetworkResponse<out T> {
    data class Success<T>(val body: T) : NetworkResponse<T>()
    data class ApiError(val error: String) : NetworkResponse<Nothing>()
    data class NetworkError(val error: String) : NetworkResponse<Nothing>()
    data class UnknownError(val error: String) : NetworkResponse<Nothing>()
}