package com.aliozdemir.dependencyinjection.analytics

import com.aliozdemir.dependencyinjection.Logger
import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    val service: AnalyticsService,
    val logger: Logger
)
