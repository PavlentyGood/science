package ru.pavlentygood.science.stream

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class BalanceKtTest {

    @Test
    fun `deposit with object`() {
        val account = Account(balance = 30)
        account.getBalance() shouldBe 30
        account.deposit(2)
        account.getBalance() shouldBe 32
    }

    @Test
    fun `deposit with sequence`() {
        val amounts = generateSequence { 2 }
        val balances = deposit(
            balance = 30,
            amountsIterator = amounts.iterator()
        )
        balances.take(5).toList() shouldBe listOf(30, 32, 34, 36, 38)
    }
}
