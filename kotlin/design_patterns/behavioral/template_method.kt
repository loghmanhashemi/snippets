/*
a base class defines the overall algorithm (the template), 
while subclasses customize certain steps. The key iodea is:

    "The algorithm's structure is fixed; some individual steps are variable."

Simple example: preparing a beverage:
    prepare()
        │
        ├── boilWater()
        ├── brew()
        ├── pourIntoCup()
        └── addExtras()


*/
abstract class Beverage {

    // Template Method
    fun prepare() {
        boilWater()
        brew()
        pourIntoCup()
        addExtras()
    }

    private fun boilWater() {
        println("Boiling water")
    }

    abstract fun brew()

    private fun pourIntoCup() {
        println("Pouring into cup")
    }

    abstract fun addExtras()
}
class Tea : Beverage() {

    override fun brew() {
        println("Steeping tea")
    }

    override fun addExtras() {
        println("Adding lemon")
    }
}

class Coffee : Beverage() {

    override fun brew() {
        println("Dripping coffee through filter")
    }

    override fun addExtras() {
        println("Adding sugar and milk")
    }
}
fun main() {
    val tea = Tea()
    tea.prepare()

    println()

    val coffee = Coffee()
    coffee.prepare()
}
