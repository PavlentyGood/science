package ru.pavlentygood.science.list

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class AppendKtTest {

    @Test
    fun append() {
        append1<Int>(null, null) shouldBe null
        append1(null, List(2, null)) shouldBe List(2, null)
        append1(List(3, null), null) shouldBe List(3, null)
        append1(List(3, null), List(2, null)) shouldBe List(3, List(2, null))

        List(6, null).append2(null) shouldBe List(6, null)
        List(6, null).append2(List(7, null)) shouldBe List(6, List(7, null))
        List(6, List(7, null)).append2(null) shouldBe List(6, List(7, null))
        List(6, List(7, null)).append2(List(8, null)) shouldBe List(6, List(7, List(8, null)))
    }
}
