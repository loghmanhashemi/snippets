/* this design pattern is for prevent you to abuse inheritance.
Suppose there is a hierarchy of devices and a hierarchy of remotecontrols:
     ┌──────────────┐                ┌──────────────┐
     │ RemoteControl│ ─────────────► │    Device    │
     └──────────────┘                └──────────────┘
            │                               ▲
            │                               │
            │                         ┌─────┴─────┐
            │                         │           │
            │                        TV         Radio
            │
     Different remote
     implementations
    
    inheritance abuse is something like we endup with classes like:

    TVRemote
    RadioRemote
    AdvancedTVRemote
    AdvancedRadioRemote
    SmartTVRemote
    SmartRadioRemote

    the key idea is composition instead of inheritance. 
    in fact we are two hierarchies:
    abstraction hierarchy and implementation hierarchy
*/
interface Device {
    fun turnOn()
    fun turnOff()
    fun setVolume(volume: Int)
}
class TV : Device {
    override fun turnOn() {
        println("TV is ON")
    }

    override fun turnOff() {
        println("TV is OFF")
    }

    override fun setVolume(volume: Int) {
        println("TV volume = $volume")
    }
}

class Radio : Device {
    override fun turnOn() {
        println("Radio is ON")
    }

    override fun turnOff() {
        println("Radio is OFF")
    }

    override fun setVolume(volume: Int) {
        println("Radio volume = $volume")
    }
}
open class RemoteControl(
    protected val device: Device
) {
    open fun powerOn() {
        device.turnOn()
    }

    open fun powerOff() {
        device.turnOff()
    }
}
class BasicRemote(
    device: Device
) : RemoteControl(device) {

    fun volumeUp() {
        device.setVolume(50)
    }
}
class AdvancedRemote(
    device: Device
) : RemoteControl(device) {

    fun mute() {
        device.setVolume(0)
    }

    fun volumeUp() {
        device.setVolume(80)
    }
}

fun main() {
    // instead of having BasicRemoteForTV class
    val basicTvRemote = BasicRemote(TV()) 
    basicTvRemote.powerOn()
    basicTvRemote.volumeUp()
    // instead of having AdvancedRemoteForTV class
    val advancedTvRemote = AdvancedRemote(TV())
    advancedTvRemote.powerOn()
    advancedTvRemote.mute()
    // instead of having BasicRemoteForRadio class
    val basicRadioRemote = BasicRemote(Radio())
    basicRadioRemote.powerOn()
    basicRadioRemote.volumeUp()
    // instead of having AdvancedRemoteForRadio class
    val advancedRadioRemote = AdvancedRemote(Radio())
    advancedRadioRemote.powerOn()
    advancedRadioRemote.mute()
}
