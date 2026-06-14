class Outer(val name: String) {
    private val message = "Hello"

    inner class Inner { // inner keyword make it non-static
        fun print() {
            println(message) //  Access outer class member
        }
        fun show() {
            println(this@Outer.name)
        }
    }
    class Nested { // static by default
        fun print() {
            println("inside nested")
            // println(message) // Error: can't access Outer members
        }
    }
}

fun main() {
    val outer = Outer("Alice")
    val inner = outer.Inner()
    val nested = Outer.Nested()
    nested.print()
    inner.print()
    inner.show()
}