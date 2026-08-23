interface PaymentProcessor{
    fun pay(amount:Double)
}
class PayPal{
    fun makePayment(value: Double){
        println("Paypal payment: $$value")
    }
}
class Checkout(private val processor: PaymentProcessor){
    fun checkout(amount : Double){
        processor.pay(amount)
    }
}
class PayPalAdapter(private val paypal: PayPal) : PaymentProcessor{
    override fun pay(amount: Double){
        paypal.makePayment(amount)
    }
}
fun main(){
    val paypal = PayPal()
//    val checkout = Checkout(paypal) wrong
    val checkout =  Checkout(PayPalAdapter(paypal))
    checkout.checkout(100.0)
}