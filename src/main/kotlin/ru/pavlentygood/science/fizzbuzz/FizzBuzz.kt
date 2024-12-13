package ru.pavlentygood.science.fizzbuzz

fun fizzBuzz1(n: Int): List<String> {
    val result = Array(n) { (it + 1).toString() }
    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result[i - 1] = "FizzBuzz"
            i % 3 == 0 -> result[i - 1] = "Fizz"
            i % 5 == 0 -> result[i - 1] = "Buzz"
            else -> result[i - 1] = i.toString()
        }
    }
    return result.toList()
}