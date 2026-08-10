fun suggestGift(amount: Int): String{
    return when(amount){
        in 0 .. 10 -> "a book"
        in 11 .. 100 -> "a guitar"
        else -> if (amount < 0) "no gift" else "anything!"
    }
}
fun main(){
    println(suggestGift(11))
}