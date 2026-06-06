fun main(){
    val pair1 = Pair("Alice", 20)
    val pair2 = "Bob" to 25
    val triple1 = Triple("Alice", 20, "Female")
    al pair = "Hello" to "World"
    val triple = Triple(1, 2, 3)
    println(pair.first)
    println(triple.third) 
    val pair = Pair("John", 29)
    val (name, age) = pair // deconstruction : also works for other classes
    println("Name: $name") // Print the value of name.


}