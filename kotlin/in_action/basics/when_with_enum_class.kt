enum class Color{ 
    RED,
    ORANGE,
    BLUE,
    PURPLE
}
fun warmth(color:Color) = 
    when(color){
        Color.RED,Color.ORANGE -> "warm"
        Color.BLUE,Color.PURPLE ->"cold"
    }
fun mnemanic(color:Color) =  // color is immutable by default no need to val
    when(color){
        Color.RED -> "richard"
        Color.ORANGE-> "olivia"
        Color.BLUE->"battle"
        Color.PURPLE->"Paris"
    }
fun main(){
    println(mnemanic(Color.BLUE))
    println(warmth(Color.BLUE))
}

