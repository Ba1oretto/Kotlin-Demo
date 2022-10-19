@file:Suppress("FunctionName", "unused", "USELESS_IS_CHECK", "USELESS_CAST", "UNUSED_VARIABLE")

fun `is and !is operators`() {
    // Identifies whether an object conforms to a given type
    val obj = ""

    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) { // same as !(obj is String)
        print("Not a String")
    } else {
        print(obj.length)
    }
}

fun `Smart casts`(x: Any) {
    if (x !is String) return
    print(x.length) // x is automatically cast to String

    // x is automatically cast to String on the right-hand side of `||`
    if (x !is String || x.length == 0) return

    // x is automatically cast to String on the right-hand side of `&&`
    if (x is String && x.length > 0) {
        print(x.length) // x is automatically cast to String
    }

    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }

    // val local variables - always, with the exception of local delegated properties.
    // val properties - if the property is private or internal or if the check is performed in the same module where the property is declared. Smart casts cannot be used on open properties or properties that have custom getters.
    // var local variables - if the variable is not modified between the check and the usage, is not captured in a lambda that modifies it, and is not a local delegated property.
    // var properties - never, because the variable can be modified at any time by other code.
}

fun `Unsafe cast operator`(y: Any) {
    val x: String = y as String // Note that null cannot be cast to String except nullable type
    val z: String? = y as String? // Note that null cannot be cast to String except nullable type
}

fun `Safe (nullable) cast operator`(y: Any) {
    val x: String? = y as? String
}