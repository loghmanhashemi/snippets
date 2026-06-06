
open class ParentClass(val name: String, val age: Int) {
    init {
         println()
         println("Hello, I am $name, and I am $age years old.")
    }
}
class ChildClass(name: String, age: Int, val occupation: String)
    : ParentClass(name, age) {
    init {
         println("My occupation is $occupation.")
    }
}
fun main() {
    // Create instances of parent and child classes.
    val person1 = ParentClass("John", 33)
    val person2 = ChildClass("Sarah", 24, "accountant")
}