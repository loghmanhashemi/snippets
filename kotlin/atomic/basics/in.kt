/*
The in keyword is used for both iteration and membership. An in inside the control
expression of a for loop means iteration, otherwise in checks membership:
 */
fun isDigit(ch: Char) = ch in '0'..'9'
fun notDigit(ch: Char) = ch !in '0'..'9'

fun main() {
    println(isDigit('a'))
    println(isDigit('5'))
    println(notDigit('z'))

    val values = 1..3
    for (v in values) { //iteration
        println("iteration $v")
    }
    val v = 2
    if (v in values) //membership
         println("$v is a member of $values")
}
/* Output:
false
true
true
iteration 1
iteration 2
iteration 3
2 is a member of 1..3

*/