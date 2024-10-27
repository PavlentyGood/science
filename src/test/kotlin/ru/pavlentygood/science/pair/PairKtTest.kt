package ru.pavlentygood.science.pair

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class PairKtTest {

    @Test
    fun list() {
        val n1 = 9
        val n2 = 7

        val list = List(n1, List(n2, null))

        list.head shouldBe n1
        list.tail shouldBe List(n2, null)
        list.tail!!.tail shouldBe null
    }
}