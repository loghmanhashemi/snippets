/*
fold:
        initial
           ↓
        accumulator
           ↓
     1 → 2 → 3 → 4
           ↓
         result


reduce:
     1 → 2 → 3 → 4
     ↑
 first element becomes
 the accumulator

 */
val numbers = listOf(1, 2, 3, 4)
//uses the first element as the initial accumulator
val sum = numbers.reduce { acc, n ->
    acc + n
}
val empty = emptyList<Int>()

fun main(){
    println(sum)  // 10
    empty.reduce { acc, n -> acc + n }
    // exception
}
