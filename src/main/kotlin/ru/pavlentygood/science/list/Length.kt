package ru.pavlentygood.science.list

fun length1(list: List<*>?): Int =
    if (list == null) 0
    else 1 + length1(list.tail)

fun length2(list: List<*>?): Int {
    tailrec fun lengthIter(list: List<*>?, n: Int): Int =
        if (list == null) n
        else lengthIter(list.tail, n + 1)

    return lengthIter(list, 0)
}

fun <A> List<A>.length3(): Int =
    1 + (tail?.length3() ?: 0)