/*
compilation and running:
kotlinc package3.kt -d .
kotlin  pythagorean.Package3Kt
*/
package pythagorean
import kotlin.math.sqrt
class RightTriangle(val a: Double, val b: Double ) {
    fun hypotenuse() = sqrt(a * a + b * b)
    fun area() = a * b / 2
}
fun main() {
    val rt = RightTriangle(3.0, 4.0)
    println(rt.hypotenuse())
    println(rt.area())
}