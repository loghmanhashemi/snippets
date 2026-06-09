
infix fun Int.times(str: String): String {
    return str.repeat(this)
}

fun main() {
    val result = 3 times "Bye "
    

    
    println("Hi ".repeat(3))
    println(result)
    
}