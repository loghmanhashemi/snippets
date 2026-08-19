// Abstract Products
interface Button {
    fun render()
}

interface Checkbox {
    fun render()
}


// Concrete Products — Windows
class WindowsButton : Button {
    override fun render() {
        println("Windows button")
    }
}

class WindowsCheckbox : Checkbox {
    override fun render() {
        println("Windows checkbox")
    }
}


// Concrete Products — Mac
class MacButton : Button {
    override fun render() {
        println("Mac button")
    }
}

class MacCheckbox : Checkbox {
    override fun render() {
        println("Mac checkbox")
    }
}


// Abstract Factory
interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}


// Concrete Factory — Windows
class WindowsFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}


// Concrete Factory — Mac
class MacFactory : GUIFactory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacCheckbox()
    }
}


// Client
fun createGUI(factory: GUIFactory) {
    val button = factory.createButton()
    val checkbox = factory.createCheckbox()

    button.render()
    checkbox.render()
}


fun main() {
    createGUI(WindowsFactory())

    println()

    createGUI(MacFactory())
}