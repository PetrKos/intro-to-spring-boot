package com.petrkos.sampleapp.introtospringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntroToSpringBootApplication

fun main(args: Array<String>) {
    runApplication<IntroToSpringBootApplication>(*args)
}
