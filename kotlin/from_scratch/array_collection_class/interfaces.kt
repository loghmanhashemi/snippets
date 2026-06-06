import kotlin.math.PI
interface Properties {
    fun area(): Double
    fun perimeter(): Double
}
class Circle(val radius: Double): Properties {
    override fun area() = PI * radius * radius
    override fun perimeter() = 2 * PI * radius
}
fun main() {
    val circle = Circle(4.0)
    val area = circle.area()
    val perimeter = circle.perimeter()
    println("Properties of the circle:")
    println(" radius = ${circle.radius}\n area = $area\n" +" perimeter = $perimeter")
}