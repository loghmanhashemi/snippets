open class Animal {
    open fun sound() {
        println("Some sound")
    }
}

object Dog : Animal() {
    override fun sound() {
        println("Woof")
    }
}

fun main() {
    Dog.sound()
}