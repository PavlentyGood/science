package ru.pavlentygood.science.list

data class List<A>(
    val head: A,
    val tail: List<A>?
)