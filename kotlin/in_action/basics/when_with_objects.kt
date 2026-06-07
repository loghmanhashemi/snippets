import Color.* // this made get rid or repeating Color. 
enum class Color{
    YELLOW,
    BLUE,
    RED,
    GREEN,
    ORANGE
}
fun mix(color1 : Color,color2: Color) =
    when(setOf(color1,color2)){
        setOf(YELLOW,RED) ->ORANGE
        setOf(YELLOW,BLUE) ->GREEN
        else -> throw Exception("Dirty Color!")
    }

fun main(){
    println(mix(YELLOW,BLUE))
}