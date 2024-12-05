package com.example.netflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NetfluxApplication

fun main(args: Array<String>) {
    runApplication<NetfluxApplication>(*args)
}
