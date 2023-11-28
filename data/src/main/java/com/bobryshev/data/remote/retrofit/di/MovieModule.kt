package com.bobryshev.data.remote.retrofit.di

import com.bobryshev.data.remote.retrofit.service.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
object MovieModule {

    @Provides
    fun provideMoviesService(retrofit: Retrofit): MovieApi {
        return retrofit.create(MovieApi::class.java)
    }
}