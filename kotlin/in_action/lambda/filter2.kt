data class Person(val name: String, val age: Int)
fun main(){
    var people = listOf(Person("Alice", 29), Person("Bob", 31))
    people = people.filter { it.age > 30 }
    println(people)
}