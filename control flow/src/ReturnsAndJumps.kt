@file:Suppress("FunctionName", "unused")

fun `Break and continue labels`() {
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            // break: like jump to label and break the loop where label marked
            // continue: like jump to label and go ahead the loop where label marked
            if (j * i > 2) break@loop
            println("j: $j")
        }
        println("i: $i")
    }
}

fun `Return to labels`() {
    fun foo1() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // non-local return directly to the caller of foo()
            print(it)
        }
        println("this point is unreachable")
    }
    fun foo2() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
            print(it)
        }
        print(" done with explicit label")
    }
    fun foo3() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
            print(it)
        }
        print(" done with implicit label")
    }
    fun foo4() {
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return  // local return to the caller of the anonymous function - the forEach loop
            print(value)
        })
        print(" done with anonymous function")
    }
    fun foo5() {
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop // non-local return from the lambda passed to run
                print(it)
            }
        }
        print(" done with nested loop")
    }
}