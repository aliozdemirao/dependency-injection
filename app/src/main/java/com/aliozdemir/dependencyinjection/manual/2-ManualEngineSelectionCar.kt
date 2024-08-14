package com.aliozdemir.dependencyinjection.manual

interface Engine2 {
    fun start()
}

class GasEngine2 : Engine2 {
    override fun start() {
        println("Gas engine started")
    }
}

class ElectricEngine2 : Engine2 {
    override fun start() {
        println("Electric engine started")
    }
}

class HybridEngine2 : Engine2 {
    override fun start() {
        println("Hybrid engine started")
    }
}

class Car2(
    private val engineType: EngineType,
) {
    private val gasEngine = GasEngine2()
    private val electricEngine = ElectricEngine2()
    private val hybridEngine = HybridEngine2()

    fun start() {
        when (engineType) {
            EngineType.GAS -> gasEngine.start()
            EngineType.ELECTRIC -> electricEngine.start()
            EngineType.HYBRID -> hybridEngine.start()
        }
    }
}

enum class EngineType {
    GAS,
    ELECTRIC,
    HYBRID,
}

fun main() {
    val gasCar = Car2(EngineType.GAS)
    gasCar.start()

    val electricCar = Car2(EngineType.ELECTRIC)
    electricCar.start()

    val hybridCar = Car2(EngineType.HYBRID)
    hybridCar.start()
}
