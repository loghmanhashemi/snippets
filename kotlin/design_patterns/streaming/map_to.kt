fun main(){
    val letters = listOf("a", "B", "c", "D")
    val results = mutableListOf<String>()
    letters.mapTo(results) {
        it.toUpperCase()
    }
    println(results)//[A, B, C, D]
    letters.mapTo(results) {
        it.toLowerCase()
    }
    println(results)//[A, B, C, D, a, b, c, d]

}


