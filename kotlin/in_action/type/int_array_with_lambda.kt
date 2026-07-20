fun main(){
    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println(squares.joinToString())   // converts an array to string, separating by camma by default
    println(squares.joinToString(" - "))
    val indices = IntArray(5) { it } // { i -> i }
    println(indices.joinToString())
}