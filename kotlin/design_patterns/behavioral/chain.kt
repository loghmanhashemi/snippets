/*
Chain of Responsibility
Pass a request through a chain of handlers until one handler handles it
(or several handlers process it)

example:

Request
   ↓
Employee
   ↓
Manager
   ↓
Director
   ↓
CEO

--------------------------------------------
another example: 

Request
   ↓
AuthHandler
   ↓
LoggingHandler
   ↓
ValidationHandler
   ↓
BusinessHandler

 */
abstract class Approver(
    private val next: Approver? = null
) {
    abstract fun approve(amount: Int)

    protected fun pass(amount: Int) {
        next?.approve(amount)
            ?: println("Nobody can approve $amount")
    }
}

class Manager(next: Approver? = null) : Approver(next) {
    override fun approve(amount: Int) {
        if (amount <= 1_000)
            println("Manager approved $amount")
        else
            pass(amount)
    }
}

class Director(next: Approver? = null) : Approver(next) {
    override fun approve(amount: Int) {
        if (amount <= 10_000)
            println("Director approved $amount")
        else
            pass(amount)
    }
}

class CEO : Approver() {
    override fun approve(amount: Int) {
        println("CEO approved $amount")
    }
}
fun main(){
    val chain =
    Manager(
        Director(
            CEO()
        )
    )

    chain.approve(5_000)
}
