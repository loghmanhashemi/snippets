data class Person(val firstName: String,
                  val lastName: String,
                  val age: Int)

val people = listOf(Person("Jane", "Doe", 19),
                    Person("John", "Doe", 24),
                    Person("John", "Smith", 23))

fun main(){
    println(people.sortedBy { it.age })
    println(people.sortedBy { it.lastName })
}