package ru.pavlentygood.science

import arrow.core.Either
import arrow.core.left
import arrow.core.right

data class List<A>(
    val head: A,
    val tail: List<A>?
)

tailrec fun <A> get1(list: List<A>, i: Int): A =
    if (i == 0) list.head
    else get1(list.tail!!, i - 1)

tailrec fun <A> get2(list: List<A>, i: UInt): Either<String, A> =
    when {
        i == 0U -> list.head.right()
        list.tail == null -> "error".left()
        else -> get2(list.tail, i - 1U)
    }

tailrec fun <A> List<A>.get3(i: Int): A =
    if (i == 0) head
    else tail!!.get3(i - 1)