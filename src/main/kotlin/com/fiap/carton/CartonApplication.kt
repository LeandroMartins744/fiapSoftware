package com.fiap.carton

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CartonApplication

fun main(args: Array<String>) {
    runApplication<CartonApplication>(*args)
}
