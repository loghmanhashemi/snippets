fun main(){
    val gold: Int = "5.91".toIntOrNull() ?: 0
    println(gold)
    val metal: Double = "5.91".toDoubleOrNull() ?: 0.0
    println(metal)
}