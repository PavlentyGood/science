package ru.pavlentygood.science.list

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class LengthKtTest {

    @Test
    fun length() {
        length1(null) shouldBe 0
        length1(List(1, null)) shouldBe 1
        length1(List(1, List(1, null))) shouldBe 2

        length2(null) shouldBe 0
        length2(List(1, null)) shouldBe 1
        length2(List(1, List(1, null))) shouldBe 2

        List(1, null).length3() shouldBe 1
        List(1, List(1, null)).length3() shouldBe 2
    }
}