package com.bobryshev.data.remote.retrofit.di

import com.bobryshev.data.dataSource.MoviesDataSource
import com.bobryshev.data.remote.retrofit.impl.MoviesDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindMovieDataSource(moviesDataSourceImpl: MoviesDataSourceImpl): MoviesDataSource
}