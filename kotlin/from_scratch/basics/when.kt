fun main() {
    val x = 5
    when {
        x > 0 -> println("x is positive") // only this line executes
        x == 5 -> println("x is equal to 5")
        x == 0 -> println("x is zero")
        x < 0 -> println("x is negative")
        else -> println("x is not a real number")
    }
}