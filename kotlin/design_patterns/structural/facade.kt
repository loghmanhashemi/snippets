class Inventory {
    fun checkStock(product: String): Boolean {
        println("Checking stock for $product")
        return true
    }
}

class Payment {
    fun processPayment(amount: Double) {
        println("Processing payment: $amount")
    }
}

class Shipping {
    fun createShipment(product: String) {
        println("Creating shipment for $product")
    }
}

class Notification {
    fun sendConfirmation() {
        println("Sending confirmation")
    }
}
class OrderFacade {

    private val inventory = Inventory()
    private val payment = Payment()
    private val shipping = Shipping()
    private val notification = Notification()

    fun placeOrder(product: String, price: Double) {

        if (!inventory.checkStock(product)) {
            println("Product is out of stock")
            return
        }

        payment.processPayment(price)
        shipping.createShipment(product)
        notification.sendConfirmation()

        println("Order completed")
    }
}

fun main() {

    val orderFacade = OrderFacade()

    orderFacade.placeOrder(
        product = "Laptop",
        price = 1200.0
    )
}