package ru.pavlentygood.science.stream

import java.util.*

/*
Пример функции в стиле ФП, позволяющей зачислять средства на баланс.
Присутствует проблема смешения ответственности: консольный интерфейс вперемешку с логикой работы баланса
 */
tailrec fun deposit(balance: Int, scanner: Scanner): Int {
    print("enter amount to deposit: ")
    val amount = scanner.nextLine().toInt() // также прямо здесь присутствует ссылочно непрозрачная функция nextLine
    val newBalance = balance + amount
    println("balance: $newBalance")
    return deposit(newBalance, scanner)
}

fun main() {
    val scanner = Scanner(System.`in`)
    deposit(balance = 30, scanner = scanner)
}
