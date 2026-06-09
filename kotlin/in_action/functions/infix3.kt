infix fun Any.to(other: Any) = Pair(this, other)

fun main() {
    val p1 = "name" to "Alice"
    val p2 = 10 to 20
    val p3 = "age" to 10

    println(p1)
    println(p2)
    println(p3)
}