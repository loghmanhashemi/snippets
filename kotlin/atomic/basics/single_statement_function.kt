fun oneOrTheOther(exp: Boolean): String =
    if (exp)
        "True!" // No 'return' necessary
    else
        "False"

fun main(){
    println(oneOrTheOther(true))
    val x = 1
    println(oneOrTheOther(x == 1))
    println(oneOrTheOther(x == 2))
}