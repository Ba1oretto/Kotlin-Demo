@file:Suppress("unused", "UNUSED_VARIABLE")

fun arrays() {
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    var arr = arrayOf(1, 2, 3)
    var arrNull = arrayOfNulls<Int>(5)

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr1 = IntArray(5)

    // Example of initializing the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }

    // Example of initializing the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialized to their index value)
    var arr3 = IntArray(5) { it * 1 }
}