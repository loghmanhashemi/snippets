//key point: The subclasses decide what the factory method creates.
interface Button {
    fun render()
}
class WindowsButton : Button {
    override fun render() {
        println("Rendering Windows button")
    }
}

class HTMLButton : Button {
    override fun render() {
        println("Rendering HTML button")
    }
}
abstract class Dialog {

    // Factory Method
    abstract fun createButton(): Button

    fun render() {
        val button = createButton()
        button.render()
    }
}
class WindowsDialog : Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}

class WebDialog : Dialog() {
    override fun createButton(): Button {
        return HTMLButton()
    }
}
fun main() {
    val dialog: Dialog = WindowsDialog()
    dialog.render()

    val webDialog: Dialog = WebDialog()
    webDialog.render()
}