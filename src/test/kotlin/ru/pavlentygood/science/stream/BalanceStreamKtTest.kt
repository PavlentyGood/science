package ru.pavlentygood.science.stream

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class BalanceStreamKtTest {

    @Test
    fun `deposit stream`() {
        val amounts = generateSequence { 2 }
        val balances = deposit(
            balance = 30,
            amountsIterator = amounts.iterator()
        )
        balances.take(5).toList() shouldBe listOf(30, 32, 34, 36, 38)
    }
}
