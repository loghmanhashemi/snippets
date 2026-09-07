//One of the most basic tuples in Kotlin is Pair
fun main(){
    var pair = "a" to 1
    //following lines result in a compilation error beacuse pair elements are immutable
    //pair.first = "b" // Doesn't work
    //pair.second = 2 // Still doesn't
    //We can destructure a Pair into two separate values:
    val (key, value) = pair
    println("$key => $value")
    //When iterating over a map, we receive another tuple, Map.Entry:
    for (p in mapOf(1 to "Sunday", 2 to "Monday")) {
        println("$p")
        println("${p.key}:${p.value}" )
    }

}