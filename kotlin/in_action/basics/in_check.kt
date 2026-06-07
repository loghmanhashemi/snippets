fun isLetter(ch :Char) = ch in 'a'..'z' || ch in 'A' .. 'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun recognize(c: Char) = when (c)
    {   
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know…"
    }
fun main(){
    println(isLetter('x'))
}