package com.bobryshev.data.remote.retrofit.service

import com.bobryshev.data.remote.model.MovieDataResponse
import com.bobryshev.data.remote.model.MovieOffers
import retrofit2.Response
import retrofit2.http.GET

interface MovieApi {

    @GET("movie_offers.json")
    suspend fun getMovieOffers(): Response<MovieOffers>

    @GET("movie_data.json")
    suspend fun getMovieData(): MovieDataResponse
}