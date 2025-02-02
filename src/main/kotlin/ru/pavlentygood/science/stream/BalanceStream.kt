package ru.pavlentygood.science.stream

import java.util.*

/*
Пример работы с балансом в стиле ФП при помощи последовательностей (стримов).
Функция принимает начальный баланс и бесконечную последовательность сумм занесения на баланс,
а возвращает бесконечную последовательность значений баланса.
 */
fun deposit(startBalance: Int, amounts: Sequence<Int>): Sequence<Int> {
    return amounts.runningFold(startBalance) { balance, amount ->
        balance + amount
    }
}

/*
Пример использования функции deposit в виде консольного приложения,
где в бесконечном цикле на экран выводится текущий баланс
и пользователь вводит сумму, которую хочет внести на баланс.
 */
fun main() {
    val scanner = Scanner(System.`in`)
    val amounts = generateSequence {
        print("enter amount to deposit: ")
        scanner.nextLine().toInt()
    }
    val balances = deposit(
        startBalance = 50,
        amounts = amounts
    )
    balances.forEach {
        println("balance: $it")
    }
}
