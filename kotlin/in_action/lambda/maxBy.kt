data class Person(val name: String, val age: Int)
fun main(){
   val people = listOf(Person("Alice",29),Person("Bob",31))
   val person = people.maxBy{ it.age }
   println(person)
}