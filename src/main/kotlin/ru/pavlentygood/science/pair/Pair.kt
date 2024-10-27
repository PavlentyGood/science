package ru.pavlentygood.science.pair

sealed class Pair<A, B>(
    val first: A,
    val second: B?
)

data class List<A>(
    val head: A,
    val tail: List<A>?
) : Pair<A, List<A>>(head, tail)