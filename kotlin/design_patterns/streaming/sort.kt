data class Person(val firstName: String,
                  val lastName: String,
                  val age: Int)

val people = listOf(Person("Jane", "Doe", 19),
                    Person("John", "Doe", 24),
                    Person("John", "Smith", 23))

fun main(){
    println(people.sortedBy { it.age })
    println(people.sortedBy { it.lastName })
    println(people.sortedByDescending { it.lastName })
    //if you want to compare by more than one parameter
    println(people.sortedWith(compareBy({it.lastName}, {it.age})))
}