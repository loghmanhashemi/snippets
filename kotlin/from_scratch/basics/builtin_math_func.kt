import kotlin.math.sqrt
import kotlin.math.pow
fun main() {
    val x = 100.0
    val y = 10.0
    val squareRoot = "The square root of $x is: ${sqrt(x)}"
    val toThePower2 = "$y raised to the 2nd power is: ${y.pow(2.0)}"
    println(squareRoot)
    println(toThePower2)
}