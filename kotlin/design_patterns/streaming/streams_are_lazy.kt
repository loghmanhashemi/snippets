import kotlin.system.measureTimeMillis

fun main(){
    //Functions starting with 'as' don't copy
    // Returns a view, no copy here
    (1..10).toList().asReversed()
    // Same here
    (1..10).toList().asSequence()

    val numbers = (1..1_000_000).toList()
    println(measureTimeMillis {
        numbers.stream().map { //actually never executes.
            it * it
        }
    }) // 1
    println(measureTimeMillis {
        numbers.map {
            it * it
        }
    }) // 703

    println(measureTimeMillis {
        numbers.asSequence().map {
            it * it
        }.toList()
    }) // 31
    
}
