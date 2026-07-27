fun printEntries(map: Map<String, String>) { 
 /*
    istead of:
    for (entry in map) {
        val key = entry.key
        val value = entry.value
        println("$key -> $value")
    }
    or: 

    val iterator = map.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        val key = entry.key
        val value = entry.value
        println("$key -> $value")
    }
  */
    for ((key, value) in map)  //Destructuring declaration
        println("$key -> $value")
}
fun main(){
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    println(map)
}