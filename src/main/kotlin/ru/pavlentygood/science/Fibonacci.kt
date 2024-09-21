package ru.pavlentygood.science

fun fib1(n: Int): Int =
    when (n) {
        0 -> 0
        1 -> 1
        else -> fib1(n - 1) + fib1(n - 2)
    }

fun fib2(n: Int): Int {
    tailrec fun fibIter(counter: Int, a: Int, b: Int): Int =
        if (counter == 0) a
        else fibIter(counter - 1, b, a + b)

    return fibIter(n, 0, 1)
}

fun fib3(n: Int) =
    if (n == 0) 0
    else generateSequence(Pair(1, 1)) {
        Pair(it.second, it.first + it.second)
    }.map { it.first }
        .take(n)
        .last()