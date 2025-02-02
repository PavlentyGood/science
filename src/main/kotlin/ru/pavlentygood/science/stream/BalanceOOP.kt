package ru.pavlentygood.science.stream

import java.util.*

/*
Пример реализации занесения средств на баланс в императивном стиле
 */
class Account(private var balance: Int) {

    fun getBalance() = balance

    fun deposit(amount: Int) {
        balance += amount
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val account = Account(balance = 50)
    while (true) {
        println("balance: ${account.getBalance()}")
        print("enter amount to deposit: ")
        val amount = scanner.nextLine().toInt()
        account.deposit(amount)
    }
}
