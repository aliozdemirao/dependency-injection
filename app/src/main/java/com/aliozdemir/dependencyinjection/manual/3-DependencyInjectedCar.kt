package com.aliozdemir.dependencyinjection.manual

interface Engine3 {
    fun start()
}

class GasEngine3 : Engine3 {
    override fun start() {
        println("Gas engine started")
    }
}

class ElectricEngine3 : Engine3 {
    override fun start() {
        println("Electric engine started")
    }
}

class HybridEngine3 : Engine3 {
    override fun start() {
        println("Hybrid engine started")
    }
}

class Car3(
    private val engine: Engine3,
) {
    fun start() {
        engine.start()
    }
}

fun main() {
    val gasEngine = GasEngine3()
    val gasCar = Car3(gasEngine)
    gasCar.start()

    val electricEngine = ElectricEngine3()
    val electricCar = Car3(electricEngine)
    electricCar.start()

    val hybridEngine = HybridEngine3()
    val hybridCar = Car3(hybridEngine)
    hybridCar.start()
}
