package com.aliozdemir.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aliozdemir.dependencyinjection.analytics.AnalyticsAdapter
import com.aliozdemir.dependencyinjection.di.AuthInterceptorRetrofit
import com.aliozdemir.dependencyinjection.di.OtherInterceptorRetrofit
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var analyticsAdapter: AnalyticsAdapter

    @AuthInterceptorRetrofit
    @Inject
    lateinit var retrofitAuth: Retrofit

    @OtherInterceptorRetrofit
    @Inject
    lateinit var retrofitOther: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Yapmaya çalıştığımız şey bu
//        analyticsAdapter = AnalyticsAdapter(object: AnalyticsService{
//            override fun analyticsMethods() {
//                Log.i("AnalyticsServiceImpl", "MainActivity")
//            }
//        })
        analyticsAdapter.service.analyticsMethods()
        analyticsAdapter.logger.boo()
    }
}
