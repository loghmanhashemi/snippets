interface Command {
    fun execute()
}
class Light {

    fun turnOn() {
        println("Light is ON")
    }

    fun turnOff() {
        println("Light is OFF")
    }
}
class TurnOnCommand(
    private val light: Light
) : Command {

    override fun execute() {
        light.turnOn()
    }
}
class TurnOffCommand(
    private val light: Light
) : Command {

    override fun execute() {
        light.turnOff()
    }
}
class RemoteControl {

    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command?.execute()
    }
}
fun main() {

    val light = Light()

    val turnOn = TurnOnCommand(light)
    val turnOff = TurnOffCommand(light)

    val remote = RemoteControl()

    remote.setCommand(turnOn)
    remote.pressButton()

    remote.setCommand(turnOff)
    remote.pressButton()
}
