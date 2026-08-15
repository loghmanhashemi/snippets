fun main(){
    val str = "word"
    for( i in 0..str.length -1 )
        println(str[i])
    
    for( i in 0 until str.length -1 )
        println(str[i])
    for( i in str.length -1 downTo 0)
        println(str[i])
}