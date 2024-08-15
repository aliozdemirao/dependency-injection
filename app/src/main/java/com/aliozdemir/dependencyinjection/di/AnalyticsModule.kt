package com.aliozdemir.dependencyinjection.di

import com.aliozdemir.dependencyinjection.analytics.AnalyticsAdapter
import com.aliozdemir.dependencyinjection.analytics.AnalyticsService
import com.aliozdemir.dependencyinjection.analytics.AnalyticsServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module // Dependency'leri yönettiğimiz hilt module class'ı.
@InstallIn(ActivityComponent::class) // Bu module'in içindeki dependency'leri SADECE activity class'larında kullanacağım deyip, sınırlandırıyoruz.
abstract class AnalyticsModule {
    @Binds // anotasyonu Hilt'e, bu interface'i hangi somut class'la eşleştirmesi gerektiğini belirtir.
    abstract fun bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl): AnalyticsService
}

// Hilt'in arkaplanda yaptığı iş bu
// val analyticsServiceImpl = AnalyticsServiceImpl()
// val analyticsService = bindAnalyticsService(analyticsServiceImpl)
// val analyticsAdapter = AnalyticsAdapter(analyticsService)
