package com.aliozdemir.dependencyinjection.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AuthInterceptorRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class OtherInterceptorRetrofit
