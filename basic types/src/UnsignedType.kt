@file:Suppress("FunctionName", "unused", "UNUSED_VARIABLE")

fun `Unsigned integer types`() {
    // UByte: an unsigned 8-bit integer, ranges from 0 to 255
    // UShort: an unsigned 16-bit integer, ranges from 0 to 65535
    // UInt: an unsigned 32-bit integer, ranges from 0 to 2^32 - 1
    // ULong: an unsigned 64-bit integer, ranges from 0 to 2^64 - 1

}

fun `Unsigned arrays and ranges`() {
    // UByteArray: an array of unsigned bytes
    // UShortArray: an array of unsigned shorts
    // UIntArray: an array of unsigned ints
    // ULongArray: an array of unsigned longs
    // To remove the warning, opt-in the @ExperimentalUnsignedTypes annotation
}

fun `Unsigned integers literals`() {
    val b: UByte = 1u  // UByte, expected type provided
    val s: UShort = 1u // UShort, expected type provided
    val l: ULong = 1u  // ULong, expected type provided

    val a1 = 42u // UInt: no expected type provided, constant fits in UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong: no expected type provided, constant doesn't fit in UInt

    val a = 1UL // ULong, even though no expected type provided and constant fits into UInt
}

@OptIn(ExperimentalUnsignedTypes::class)
fun `Use cases`() {
    // Utilizing the full bit range of an integer to represent positive values
    val color: UInt = 0xFFCC00CCu
    val byteOrderMarkUtf8 = ubyteArrayOf(0xEFu, 0xBBu, 0xBFu)

    // Non-goals
    // List.lastIndex being -1 for an empty list
    // Neither signed, nor unsigned integers are subtypes of each other
}