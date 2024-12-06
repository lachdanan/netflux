package com.example.netflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class NetfluxApplication

fun main(args: Array<String>) {
    runApplication<NetfluxApplication>(*args)
}
