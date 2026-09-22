val numbers = (1..5)
fun main(){
    println(numbers.joinToString { "$it"})
    println(numbers.joinToString(separator = "#") { "$it"})
}

