fun main(){
    val numbers = (1..5).toList()
    println(numbers.drop(2)) // [3, 4, 5]
    println(numbers) // [1, 2, 3, 4, 5]
    println(numbers.dropLast(2)) // [1, 2, 3]
    val readings = listOf(-7, -2, -1, -1, 0, 1, 3, 4)
    println(readings.dropWhile {
        it <= 0
    }) // [1, 3, 4]
}