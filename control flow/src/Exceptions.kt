@file:Suppress("FunctionName", "unused", "UNUSED_VARIABLE")

import java.lang.NumberFormatException

fun `Exception classes`(input: String) {
    // The value of `a` is input.toInt() or null, finally block don't affect the result
    val a = try { input.toInt() } catch (e: NumberFormatException) { null }
}

fun `Checked exceptions`() {
    // Kotlin does not have checked exceptions
}

fun `The Nothing type`(s: String?) {
    val str = s ?: throw IllegalArgumentException("Name required")

    // Nothing: this type has no values and is used to mark code locations that can never be reached
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }

    val x = null           // 'x' has type `Nothing?`
    val l = listOf(null)   // 'l' has type `List<Nothing?>
}