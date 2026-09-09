val numbers = listOf(1, 2, 3, 4, 5, 6)
fun eager(){
    val result = numbers
    .filter { it % 2 == 0 }
    .map { it * 10 }

    println(result)
}
fun lazy(){
    val result = numbers
    .asSequence()
    .filter { it % 2 == 0 }
    .map { it * 10 }
    .toList()

    println(result)
}
fun main(){
    eager()
    lazy()
}