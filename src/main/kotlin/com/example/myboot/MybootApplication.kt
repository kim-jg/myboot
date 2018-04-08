package com.example.myboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MybootApplication

fun main(args: Array<String>) {
    runApplication<MybootApplication>(*args)
}
