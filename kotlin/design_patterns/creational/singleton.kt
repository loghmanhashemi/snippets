import java.util.concurrent.atomic.AtomicInteger
object CounterSingleton {
    init{
        println( "I was acessed for the first time")
    }
    var counter = AtomicInteger(0)
    fun increment() = counter.incrementAndGet()
}

fun main(){
    for ( i in 1..10)
        println(CounterSingleton.increment())
}