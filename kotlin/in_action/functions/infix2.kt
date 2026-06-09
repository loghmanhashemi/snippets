class Person(val name: String)

infix fun Person.likes(other: Person) {
    println("${this.name} likes ${other.name}")
}

fun main() {
    val alice = Person("Alice")
    val bob = Person("Bob")

    alice likes bob
}