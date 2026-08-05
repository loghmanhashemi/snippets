fun main(){
    val s1 = "ABC"
    val s2 = String(s1.toCharArray())
    println(s1 == s2) // true
    println(s1 === s2) // false
}