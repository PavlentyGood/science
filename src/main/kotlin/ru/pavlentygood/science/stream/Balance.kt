package ru.pavlentygood.science.stream

import java.util.*

/*
Пример реализации занесения средств на баланс с использованием присваивания
 */
class Account(private var balance: Int) {

    fun getBalance() = balance

    fun deposit(amount: Int) {
        balance += amount
    }
}

/*
Другой пример, уже без присваивания.
Функция принимает начальный баланс и итератор от бесконечной последовательности сумм занесения на баланс,
а возвращает бесконечную последовательность значений баланса.
 */
fun deposit(balance: Int, amountsIterator: Iterator<Int>): Sequence<Int> {
    return sequence {
        yield(balance)
        yieldAll(deposit(
            balance = balance + amountsIterator.next(),
            amountsIterator = amountsIterator
        ))
    }
}

/*
Пример использования функции deposit в виде консольного приложения,
где в бесконечном цикле на экран выводится текущий баланс
и пользователь вводит сумму, которую хочет внести на баланс.

Таким образом при помощи функции deposit мы моделируем изменяющийся во времени баланс,
однако, делаем это, не применяя присваивание.
 */
fun main() {
    val scanner = Scanner(System.`in`)
    val amounts = generateSequence {
        print("enter amount to deposit: ")
        scanner.nextLine().toInt()
    }
    val balances = deposit(
        balance = 50,
        amountsIterator = amounts.iterator()
    )
    balances.forEach {
        println("balance: $it")
    }
}
