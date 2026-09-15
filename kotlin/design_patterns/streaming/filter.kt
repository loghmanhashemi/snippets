fun filter(numbers: List<Int>, check: (Int)->Boolean): MutableList<Int> {
    val result = mutableListOf<Int>()
    for (n in numbers) {
        if (check(n)) {
            result.add(n)
        }
    }
    return result
}
fun main(){
    println(filter((1..10).toList()) {
        it % 2 != 0
    }) // [1, 3, 5, 7, 9]
}