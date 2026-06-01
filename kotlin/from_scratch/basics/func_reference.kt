fun add(x: Double, y: Double): Double {
    return x + y
}
fun multiply(x: Double, y: Double): Double {
    return x * y
}

fun func1(){
    println("func1")
}
fun func2(){
    println("func2")
}
fun main(){
    val selected1 = ::func1
    selected1()
    val selected2 = ::multiply
    val result = selected2(4.0,5.0)
    println("result: $result")
}