package com.example.netflux

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<NetfluxApplication>().with(TestcontainersConfiguration::class).run(*args)
}
