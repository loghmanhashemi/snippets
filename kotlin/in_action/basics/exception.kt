fun getPercent(number : Int) :Int?{
    val percentage : Int? =
    if (number in 0..100)
        number
    else
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")
    return percentage
}

fun main(){
    try{
        getPercent(150)
    }
    catch( e: IllegalArgumentException){
        println(e)
    }
    
}