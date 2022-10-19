@file:Suppress("FloatingPointLiteralPrecision", "FunctionName", "unused", "UNUSED_VARIABLE",
    "RedundantNullableReturnType", "RedundantExplicitType", "KotlinConstantConditions"
)

fun `Integer types`() {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
}

fun `Floating-point types`() {
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
}

fun `Literal constants for numbers`() {
    val decimals = 123
    val longs = 123L
    val hexadecimals = 0x0F
    val binaries = 0b00001011

    val doubles = 123.5
    val alsoDoubles = 123.5e10

    val floats = 123.5F

    // more readable
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
}

fun `Numbers representation on the JVM`() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    // in -128..127, due to memory optimization, the nullable references to variable are actually the same object
    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false, references different
    println(boxedB == anotherBoxedB) // true, value same
}

fun `Explicit number conversions`() {
    val b: Byte = 1
    val i1: Int = b.toInt()
    val l = 1L + 3 // Long + Int => Long
}

fun `Operations on numbers`() {
    // standard operations: +, -, *, /, %
    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

    // Division of integers
    val x = 5 / 2
    val y = 5L / 2
    val z = 5 / 2.toDouble()
    println(x == 2)
    println(y == 2L)
    println(z == 2.5)

    // Bitwise operations
    // shl(bits) – signed shift left <<
    // shr(bits) – signed shift right >>
    // ushr(bits) – unsigned shift right >>>
    // and(bits) – bitwise AND &
    // or(bits) – bitwise OR |
    // xor(bits) – bitwise XOR ^
    // inv() – bitwise inversion ~
    val a = (1 shl 2) and 0x000FF000

    // Floating-point numbers comparison
    // Equality checks: a == b and a != b
    // Comparison operators: a < b, a > b, a <= b, a >= b
    // Range instantiation and range checks: a..b, x in a..b, x !in a..b
    // NaN is considered equal to itself
    // NaN is considered greater than any other element including POSITIVE_INFINITY
    // -0.0 is considered less than 0.0
}