package com.aliozdemir.dependencyinjection.manual

class Engine1 {
    fun start() {
        println("engine start")
    }
}

class Car1 {
    private val engine = Engine1() // Car class'ı Engine class'ına bağımlı.

    fun start() {
        engine.start()
    }
}

fun main() {
    val car = Car1()
    car.start()
}
