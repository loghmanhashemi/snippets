fun main(){
    val letters = Array(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))
}