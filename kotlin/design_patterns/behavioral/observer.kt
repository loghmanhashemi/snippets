/*
one object changes state and multiple other objects need to be notified automatically.
           Subject
                │
       state changes
                │
       ┌────────┼────────┐
       ↓        ↓        ↓
  Observer A Observer B Observer C


Observers subscribe to a Subject, and the Subject notifies them when something happens.

 */

interface Observer {
    fun update(temperature: Double)
}
class WeatherStation {

    private val observers = mutableListOf<Observer>()

    private var temperature = 0.0

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun setTemperature(newTemperature: Double) {
        temperature = newTemperature

        // Notify all observers
        for (observer in observers) {
            observer.update(temperature)
        }
    }
}
class PhoneDisplay : Observer {
    override fun update(temperature: Double) {
        println("Phone: temperature = $temperature")
    }
}

class TVDisplay : Observer {
    override fun update(temperature: Double) {
        println("TV: temperature = $temperature")
    }
}
fun main() {
    val station = WeatherStation()

    val phone = PhoneDisplay()
    val tv = TVDisplay()

    station.addObserver(phone)
    station.addObserver(tv)

    station.setTemperature(25.0)
    station.setTemperature(30.0)
}
