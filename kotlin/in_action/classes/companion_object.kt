//companion object is tied to the class, not instances
class Car(val model: String) {

    companion object {
        const val WHEELS = 4

        fun createTesla(model: String): Car {
            return Car(model)
        }
    }
}

fun main() {
    // Access companion object members using class name
    println(Car.WHEELS)

    val car = Car.createTesla("Model S")
    println(car.model)
}