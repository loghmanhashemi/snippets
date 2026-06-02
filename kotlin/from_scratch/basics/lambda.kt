fun main(){
    val greet1 : (String) -> String = { name -> "hello $name " }
    val greet2 = { name:String ->"hi $name"}
    println(greet1("alice"))
    println(greet2("bob"))
    val sum : (Int,Int) -> Int = {a,b->a+b}
    val square: (Int)->Int = {it*it}// instead of {a->a*a}
    println(sum(2,3))
    println(square(4))
}