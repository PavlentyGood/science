package ru.pavlentygood.science

import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class FactorialKtTest {

    @Test
    fun factorial() {
        listOf<(Int) -> Int>(
            ::fact1,
            ::fact2,
            ::fact3,
            ::fact5,
            ::fact6
        ).forEach { f ->
            f(0) shouldBe 1
            f(1) shouldBe 1
            f(5) shouldBe 120
            f(12) shouldBe 479001600
        }

        fact4(0) shouldBeRight 1
        fact4(1) shouldBeRight 1
        fact4(5) shouldBeRight 120
        fact4(12) shouldBeRight 479001600

        shouldThrow<IllegalArgumentException> { fact5(-1) }
    }
}