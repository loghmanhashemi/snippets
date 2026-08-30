interface State {
    fun insertCoin(machine: VendingMachine)
    fun selectProduct(machine: VendingMachine)
    fun dispense(machine: VendingMachine)
}
class NoCoinState : State {

    override fun insertCoin(machine: VendingMachine) {
        println("Coin inserted.")
        machine.state = HasCoinState()
    }

    override fun selectProduct(machine: VendingMachine) {
        println("Please insert a coin first.")
    }

    override fun dispense(machine: VendingMachine) {
        println("Please insert a coin first.")
    }
}
class HasCoinState : State {

    override fun insertCoin(machine: VendingMachine) {
        println("Coin already inserted.")
    }

    override fun selectProduct(machine: VendingMachine) {
        println("Product selected.")
        machine.state = SoldState()
    }

    override fun dispense(machine: VendingMachine) {
        println("Please select a product first.")
    }
}
class SoldState : State {

    override fun insertCoin(machine: VendingMachine) {
        println("Please wait. Product is being dispensed.")
    }

    override fun selectProduct(machine: VendingMachine) {
        println("Product already selected.")
    }

    override fun dispense(machine: VendingMachine) {
        println("Product dispensed.")
        machine.state = NoCoinState()
    }
}
class VendingMachine {

    var state: State = NoCoinState()

    fun insertCoin() {
        state.insertCoin(this)
    }

    fun selectProduct() {
        state.selectProduct(this)
    }

    fun dispense() {
        state.dispense(this)
    }
}
fun main() {

    val machine = VendingMachine()

    machine.selectProduct()

    machine.insertCoin()

    machine.insertCoin()

    machine.selectProduct()

    machine.dispense()

    machine.dispense()
}
