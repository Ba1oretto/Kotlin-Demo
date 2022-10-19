@file:Suppress("unused", "RedundantExplicitType")

fun characters() {
    // \t – tab
    // \b – backspace
    // \n – new line (LF)
    // \r – carriage return (CR)
    // \' – single quotation mark
    // \" – double quotation mark
    // \\ – backslash
    // \$ – dollar sign

    val aChar: Char = 'a'
    println(aChar)
    println('\n') // Prints an extra newline character
    println('\uFF00') // unicode
}