data class Person(val firstName: String,
                  val lastName: String,
                  val age: Int)

val people = listOf(Person("Jane", "Doe", 19),
                    Person("John", "Doe", 24),
                    Person("John", "Smith", 23))

fun <T> List<T>.find(check: (T) -> Boolean): T? {
    for (p in this) {
        if (check(p)) {
            return p
        }
    }
    return null
}
fun main(){
    println(people.find {
        it.firstName == "John"
    }) //Person(firstName=John, lastName=Doe, age=24)
    
}

