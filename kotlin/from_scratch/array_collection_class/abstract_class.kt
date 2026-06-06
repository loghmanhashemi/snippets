abstract class Shape {
    abstract fun area(): Double // abstract method
        val name: String = "Shape"
        // concrete property
        fun describe() {
            println("This is a $name")
        }
}
class Circle(val radius: Double): Shape() {
    override fun area(): Double {
         return Math.PI * radius * radius
    }
}
class Square(val side: Double): Shape() {
    override fun area(): Double {
        return side * side
    }
}
fun main() {
    val circle = Circle(5.0)
    val square = Square(4.0)
    circle.describe()
    println("Area of the circle: ${circle.area()}")
    square.describe()
    println("Area of the square: ${square.area()}")
}