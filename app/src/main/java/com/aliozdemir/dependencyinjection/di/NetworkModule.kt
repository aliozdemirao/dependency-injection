package com.aliozdemir.dependencyinjection.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @AuthInterceptorRetrofit
    @Singleton
    @Provides
    fun provideAuthRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build()
    }

    @OtherInterceptorRetrofit
    @Singleton
    @Provides
    fun provideOtherRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build()
    }

}
