fun nameIsLong(name: String) = name.length >= 20

fun main(){
    
    // despite apply , run doesnt return reciever
    println( "Madrigal".run(::nameIsLong) )// False 
    println("Polarcubis, Supreme Master of NyetHack".run(::nameIsLong)  )// True
}
