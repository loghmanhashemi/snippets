data class Person(val name:String,val age:Int)
fun main(){
   var people = listOf(Person("ALice",29),Person("Bob",31))
   println(people.all({p :Person->p.age<27}))
}
//false