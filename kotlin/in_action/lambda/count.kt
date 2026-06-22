data class Person(val name:String,val age:Int)
fun main(){
   val people= listOf(Person("Alice",21),Person("Bob",19))
   val count = people.count({it.age == 21})
   println(count)
}