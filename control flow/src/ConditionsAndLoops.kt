@file:Suppress("FunctionName", "unused", "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "UNUSED_VALUE", "UnnecessaryVariable",
    "RedundantExplicitType"
)

fun `If expression`(a: Int = 0, b: Int = 0) {
    // if is an expression

    var max = if (a > b) a else b

    max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}

fun `When expression`(x: Any, y: Any) {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

    when (x) {
        // not only constance
        "1".toInt() -> print("1")
        // common behavior for multiple cases
        2, 3 -> print("2, 3")
        else -> print("?")
    }

    if (x is Bit) {
        var numericValue = when (x) {
            Bit.ZERO -> 0
            Bit.ONE -> 1
            // 'else' is not required because all cases are covered
        }
        numericValue = when (x) {
            Bit.ZERO -> 0 // no branch for ONE
            else -> 1 // 'else' is required
        }
    } else {
        // check a value for being in or !in a range or a collection
        val validNumbers = arrayOf(1, 2, 3)
        when (x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            !in 10 until 20 -> print(":(")
            else -> print("none of the above")
        }
    }

    fun hasPrefix(x: Any) = when (x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

    if (x is Int && y is Int) {
        when {
            (x and 1) == 1 -> print("x is odd")
            (y and 1) == 0 -> print("y is even")
            else -> print("x+y is odd")
        }
    }

    fun test() =
        when (val z = x) { // statement with initializer
            is Int -> z + 1
            is String -> z + ""
            else -> ""
        }
}

fun `For loops`(collection: Collection<Any>) {
    for (item in collection) print(item)
    for (i in 1..3) {
        print(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    val array = intArrayOf(1, 2, 3)
    for (i in array.indices) {
        println(array[i])
    }
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
        if (index < 3) continue
        else if (index > 5) break
    }
}

fun `While loops`(y: Any?) {
    var x: Int = 10
    while (x > 0) x--

    do {
        val z = y
    } while (z != null) // y is visible here!
}

enum class Bit {
    ZERO, ONE
}