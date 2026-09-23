val numbers = listOf(1, 2, 3, 4)

val sum = numbers.fold(0) { accumulator, n ->
    accumulator + n
}

val words = listOf("one", "two", "three")

val result = words.fold("") { acc, word ->
    "$acc $word"
}




fun main(){
    println(sum)   // 10
    println(result)   // " one two three"
}
