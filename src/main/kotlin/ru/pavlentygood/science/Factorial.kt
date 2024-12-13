package ru.pavlentygood.science

import arrow.core.Either
import arrow.core.left
import arrow.core.right

fun fact1(n: Int): Int =
    if (n <= 1) 1
    else n * fact1(n - 1)

fun fact2(n: Int): Int {
    fun factIter(acc: Int, counter: Int, max: Int): Int =
        if (counter > max) acc
        else factIter(acc * counter, counter + 1, max)

    return factIter(1, 1, n)
}

fun fact3(n: Int): Int {
    tailrec fun factIter(acc: Int, counter: Int): Int =
        if (counter <= 1) acc
        else factIter(acc * counter, counter - 1)

    return factIter(1, n)
}

fun fact4(n: Int): Either<String, Int> =
    when {
        n < 0 -> "error".left()
        n in 0..1 -> 1.right()
        else -> fact4(n - 1)
            .map { it * n }
    }

fun fact5(n: Int): Int {
    require(n >= 0) { "error" }
    return if (n in 0..1) 1
    else n * fact1(n - 1)
}

fun fact6(n: Int): Int {
    require(n >= 0) { "error" }
    return when {
        n == 0 -> 1
        else -> (1..n).reduce { acc, i -> acc * i }
    }
}