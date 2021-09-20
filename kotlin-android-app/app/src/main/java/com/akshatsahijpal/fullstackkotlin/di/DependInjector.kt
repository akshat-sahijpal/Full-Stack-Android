package com.akshatsahijpal.fullstackkotlin.di

import com.akshatsahijpal.fullstackkotlin.remote.CustomApi
import com.akshatsahijpal.fullstackkotlin.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DependInjector {
    @Provides
    @Singleton
    fun getApi() = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(Constants.base_url).build().create(CustomApi::class.java)
}