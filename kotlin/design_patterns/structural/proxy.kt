/*
an object that stands in front of another object 
and controls access to it
The proxy can do something before or after delegating to the real object

Common uses:
    Lazy loading — create an expensive object only when needed
    Access control — check permissions
    Caching — return cached results
    Logging — log calls
    Remote proxy — represent an object running somewhere else

*/

interface BankAccount {
    fun getBalance(): Double
    fun withdraw(amount: Double)
}
class RealBankAccount(
    private var balance: Double
) : BankAccount {

    override fun getBalance(): Double {
        return balance
    }

    override fun withdraw(amount: Double) {
        if (amount > balance) {
            throw IllegalArgumentException("Insufficient funds")
        }

        balance -= amount
        println("Withdrew $amount")
    }
}
class BankAccountProxy(
    private val realAccount: BankAccount,
    private val isAuthorized: Boolean
) : BankAccount {

    override fun getBalance(): Double {
        return realAccount.getBalance()
    }

    override fun withdraw(amount: Double) {
        if (!isAuthorized) {
            throw IllegalAccessException("You are not authorized")
        }

        realAccount.withdraw(amount)
    }
}
fun main() {
    val realAccount = RealBankAccount(1000.0)

    val account = BankAccountProxy(
        realAccount = realAccount,
        isAuthorized = false
    )

    println(account.getBalance())

    account.withdraw(100.0) // throws exception
}
