fun main (){
    println("12.345-6.A".split(".","-"))
    println("12.345-6.A".split("\\.|-".toRegex()))
}