package com.aliozdemir.dependencyinjection.analytics

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    val service: AnalyticsService,
)
