// kotlinc atomictest/AtomicTest.kt vararg2.kt 
import atomictest.eq
fun sum(vararg numbers: Int): Int {
    var total = 0
    for (n in numbers) {
      total += n
    }
    return total
}
fun main() {
    val array = intArrayOf(4, 5)
    sum(1, 2, 3, *array, 6) eq 21 //spread operator
    // Doesn't compile:
    // sum(1, 2, 3, array, 6)
    val list = listOf(9, 10, 11)
    sum(*list.toIntArray()) eq 30

}
/*
21
30
 */