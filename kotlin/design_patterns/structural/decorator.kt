interface Coffee {
    fun cost(): Double
    fun description(): String
}

// Concrete component
class Espresso : Coffee {
    override fun cost() = 2.0
    override fun description() = "Espresso"
}

// Base decorator
abstract class CoffeeDecorator(
    protected val coffee: Coffee
) : Coffee

// Concrete decorators
class Milk(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost() = coffee.cost() + 0.5
    override fun description() = coffee.description() + ", Milk"
}

class Sugar(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost() = coffee.cost() + 0.2
    override fun description() = coffee.description() + ", Sugar"
}

class WhippedCream(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost() = coffee.cost() + 0.7
    override fun description() = coffee.description() + ", Whipped Cream"
}

fun main() {
    var coffee: Coffee = Espresso()

    coffee = Milk(coffee)
    coffee = Sugar(coffee)
    coffee = WhippedCream(coffee)

    println(coffee.description())
    println("Cost: ${coffee.cost()}")
}