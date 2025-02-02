package ru.pavlentygood.science.stream

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class BalanceOOPKtTest {

    @Test
    fun `deposit OOP`() {
        val account = Account(balance = 30)
        account.getBalance() shouldBe 30
        account.deposit(2)
        account.getBalance() shouldBe 32
    }
}
