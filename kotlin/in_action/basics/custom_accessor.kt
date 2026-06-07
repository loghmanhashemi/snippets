class Rectangle(var height:Int,var width :Int){
    val isSquare:Boolean
        get(){
            return height == width
        }
}

fun main(){
    val r = Rectangle(2,3)
    println(r.isSquare)
}