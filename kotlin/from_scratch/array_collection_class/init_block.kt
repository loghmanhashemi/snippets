
class Person (var name: String, var age: Int) {
    // additional property
    var isMinor: Boolean = false
    // runs just after primary constructor and before secondaries
    init {
        if (age < 18) isMinor = true
    }
}

fun main(){
    val person1 = Person ("Alice",10)
    val person2 = Person ("Bob",20)


}