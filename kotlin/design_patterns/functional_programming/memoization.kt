val cache = mutableMapOf<Int, Int>()

fun square(x: Int): Int {
    return cache.getOrPut(x) {
        println("calculating...")
        x * x
    }
}
fun main(){
    println(square(5)) // calculating... → 25
    println(square(5)) // 25
    println(square(5)) // 25
}