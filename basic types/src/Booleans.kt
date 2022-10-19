@file:Suppress("RedundantExplicitType", "unused", "UNUSED_VARIABLE")

fun booleans() {
    // Boolean has a nullable counterpart Boolean?
    // || – disjunction (logical OR)
    // && – conjunction (logical AND)
    // ! – negation (logical NOT)
    // || and && work lazily.
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
}