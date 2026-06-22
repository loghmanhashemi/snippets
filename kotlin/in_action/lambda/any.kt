data class Person(val name:String,val age:Int)
fun main(){
   var people = listOf(Person("ALice",29),Person("Bob",31))
   println(people.any({p :Person->p.age<30}))
   val list = listOf(1,2,3,4)
   println(list.any({it ==3}))
}