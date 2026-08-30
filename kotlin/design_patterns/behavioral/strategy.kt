interface PaymentStrategy {
    fun pay(amount: Double)
}

class CreditCardPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $$amount using Credit Card")
    }
}

class PayPalPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $$amount using PayPal")
    }
}

class ShoppingCart(private var paymentStrategy: PaymentStrategy) {

    fun setPaymentStrategy(strategy: PaymentStrategy) {
        paymentStrategy = strategy
    }

    fun checkout(amount: Double) {
        paymentStrategy.pay(amount)
    }
}

fun main() {
    val cart = ShoppingCart(CreditCardPayment())

    cart.checkout(100.0)

    cart.setPaymentStrategy(PayPalPayment())
    cart.checkout(200.0)
}