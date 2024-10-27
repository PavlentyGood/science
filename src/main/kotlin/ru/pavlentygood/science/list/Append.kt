package ru.pavlentygood.science.list

fun <A> append1(a: List<A>?, b: List<A>?): List<A>? =
    if (a == null) b
    else List(a.head, append1(a.tail, b))

fun <A> List<A>.append2(a: List<A>?): List<A> =
    List(head, tail?.append2(a) ?: a)