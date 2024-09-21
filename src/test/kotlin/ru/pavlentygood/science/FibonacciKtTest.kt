package ru.pavlentygood.science

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class FibonacciKtTest {

    @Test
    fun fib() {
        listOf<(Int) -> Int>(
            ::fib1,
            ::fib2,
            ::fib3
        ).forEach { f ->
            f(0) shouldBe 0
            f(1) shouldBe 1
            f(7) shouldBe 13
            f(46) shouldBe 1836311903
        }
    }
}