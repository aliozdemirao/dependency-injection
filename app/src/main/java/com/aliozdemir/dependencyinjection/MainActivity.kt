package com.aliozdemir.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aliozdemir.dependencyinjection.analytics.AnalyticsAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var analyticsAdapter: AnalyticsAdapter

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
    }
}
