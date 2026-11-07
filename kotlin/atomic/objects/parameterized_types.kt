//usage: kotlinc atomictest/AtomicTest.kt parameterized_types.kt
import atomictest.eq
fun inferred(p: Char, q: Char) = listOf(p, q)
// Explicit return type:
fun explicit(p: Char, q: Char): List<Char> = listOf(p, q)
fun main() {
    // Type is inferred:
    val numbers = listOf(1, 2, 3)
    val strings =  listOf("one", "two", "three")
    // Exactly the same, but explicitly typed:
    val numbers2: List<Int> = listOf(1, 2, 3)
    val strings2: List<String> = listOf("one", "two", "three")
    numbers eq numbers2
    strings eq strings2
    inferred('a', 'b') eq "[a, b]"
    explicit('y', 'z') eq "[y, z]"
}
/*
[1, 2, 3]
[one, two, three]
[a, b]
[y, z]
 */