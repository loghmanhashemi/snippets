enum class SimpleColor{ //takes no params
    RED,
    ORANGE,
    BLUE,
    PURPLE
}
enum class ComplexColor(val r:Int,val g:Int,val b:Int){ //takes params
    RED(255,0,0),
    ORANGE(255,165,0),
    YELLOW(255,255,0),
    BLUE(0,0,255);
    fun rgb() =  (r*256 +g)*256 + b
    
}
fun main(){
    val cc = ComplexColor.RED
    println(cc.rgb())
    println(ComplexColor.BLUE.rgb())

}
