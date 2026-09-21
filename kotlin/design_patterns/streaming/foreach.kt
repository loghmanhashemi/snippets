fun main(){
    val numbers = (0..5)
    numbers.map { it * it}    // Can continue
        .filter { it < 20 }    // Can continue
        .sortedDescending()    // Still can
        .forEach { print(it);print(" ") } // Cannot continue
    //16 9 4 1 0 
    println()
    numbers.map { it * it }
        .forEachIndexed { index, value ->
        print("$index:$value, ")
    }
    //0:0, 1:1, 2:4, 3:9, 4:16, 5:25,
    println()
    numbers.map { it * it}
        .filter { it < 20 }
        .sortedDescending()
        .onEach { print(it);print(" ") } // Can continue now
        .filter { it > 5 }
    //16 9 4 1 0 
    println()
}