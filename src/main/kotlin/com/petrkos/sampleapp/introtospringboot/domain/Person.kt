package com.petrkos.sampleapp.introtospringboot.domain

data class Person(
    val id: Int,
    val firstName: String,
    val lastName: String,
    var age: Int
)