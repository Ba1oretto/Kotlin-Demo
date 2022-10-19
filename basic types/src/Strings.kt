@file:Suppress("FunctionName", "unused", "UNUSED_VALUE",
    "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "UNUSED_VARIABLE"
)

fun `String literals`() {
    // Escaped strings
    val s = "Hello, world!\n"

    // Raw strings
    var text = """
    for (c in "foo")
        print(c)
    """

    // Remove leading whitespace
    text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    // by default, a pipe symbol | is used as margin prefix
    // but you can choose another character and pass it as a parameter, like trimMargin(">")
}

fun `String templates`() {
    // A dollar sign consists of either a name
    val i = 10
    println("i = $i") // Prints "i = 10"

    // Expression in curly braces
    val s = "abc"
    println("$s.length is ${s.length}") // Prints "abc.length is 3"

    // Insert dollar sign in a raw string
    val price = """
    ${'$'}_9.99
    """
}