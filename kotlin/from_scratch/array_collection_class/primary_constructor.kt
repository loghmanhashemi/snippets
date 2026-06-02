class Person(val name:String="" ,val age:Int=0){
    override fun toString() : String{
        return "Person(name: $name, age:$age)"
    }
}
fun main(){
    var person1 = Person("John",20)
    var person2 = Person("rose",16)
    println(person1)
    println(person2)
}