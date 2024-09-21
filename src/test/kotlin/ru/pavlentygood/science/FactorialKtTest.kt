package ru.pavlentygood.science

import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class FactorialKtTest {

    @Test
    fun factorial() {
        listOf<(Int) -> Int>(
            ::factorial1,
            ::factorial2,
            ::factorial3,
            ::factorial5
        ).forEach { f ->
            f(0) shouldBe 1
            f(1) shouldBe 1
            f(5) shouldBe 120
            f(12) shouldBe 479001600
        }

        factorial4(0) shouldBeRight 1
        factorial4(1) shouldBeRight 1
        factorial4(5) shouldBeRight 120
        factorial4(12) shouldBeRight 479001600

        shouldThrow<IllegalArgumentException> { factorial5(-1) }
    }
}