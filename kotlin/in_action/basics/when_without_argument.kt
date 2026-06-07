import Color.*
enum class Color{
    ORANGE,
    RED,
    BLUE,
    YELLOW,
    GREEN
}
fun mix(color1:Color,color2:Color) = 
    when{
        (color1 == YELLOW && color2 == BLUE) ||
        (color2 == YELLOW && color1 == BLUE) -> GREEN

        (color1 == YELLOW && color2 == RED) ||
        (color2 == YELLOW && color1 == RED) -> ORANGE

        else -> throw Exception("Dirty Color!")
    }

fun main(){
    println(mix(YELLOW,RED))
}