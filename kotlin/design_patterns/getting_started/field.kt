class Person(){
    var name : String = ""
    set(value){
        field = value.toUpperCase()
    }
    var age : Int = 0
    set(value){
        field = value * 10
    }

}
fun main(){
    var p = Person()
    p.name = "Alex"
    p.age = 3
    println ("${p.name}  ${p.age}")
}