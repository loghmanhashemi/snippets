
class Car(val make: String, val model: String, val year: Int) {
    // property initialization inside class body
    var color: String = "Unknown"
    // 1st secondary constructor (no args)
    constructor() : this("Unknown", "Unknown", 0)
    // 2nd secondary constructor (1 arg)
    constructor(make: String) : this(make, "Unknown", 0)
    // 3rd secondary constructor (2 args)
    constructor(make: String, model: String) : this(make, model, 0)
    override fun toString(): String =
        "Make: ${make}, Model: ${model}, Year: ${year}, Color: ${color}"
}

fun main() {
    val c1 = Car()
    val c2 = Car("Nissan")
    val c3 = Car("Toyota", "Prius")
    val c4 = Car("Ford", "Mustang", 2024)
    c1.color = "Blue"
    c2.color = "Red"
    c3.color = "Black"
    c4.color = "Yellow"
    println(c1)
    println(c2)
    println(c3)
    println(c4)
}
