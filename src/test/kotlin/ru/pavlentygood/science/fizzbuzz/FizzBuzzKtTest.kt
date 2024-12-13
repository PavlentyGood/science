package ru.pavlentygood.science.fizzbuzz

import io.kotest.matchers.collections.shouldContainExactly
import org.junit.jupiter.api.Test

class FizzBuzzKtTest {

    @Test
    fun fizzBuzz() {
        fizzBuzz1(15) shouldContainExactly listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
    }
}