package ru.pavlentygood.science

import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class ItemByIndexKtTest {

    @Test
    fun get() {
        val list = List(5, List(2, null))

        get1(list, 0) shouldBe 5
        get1(list, 1) shouldBe 2
        shouldThrow<NullPointerException> { get1(list, 2) }
        shouldThrow<NullPointerException> { get1(list, -1) }

        get2(list, 0U) shouldBeRight 5
        get2(list, 1U) shouldBeRight 2
        get2(list, 2U) shouldBeLeft "error"

        list.get3(0) shouldBe 5
        list.get3(1) shouldBe 2
        shouldThrow<NullPointerException> { list.get3(2) }
        shouldThrow<NullPointerException> { list.get3(-1) }
    }
}