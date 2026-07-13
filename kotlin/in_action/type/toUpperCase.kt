fun printAllUpperCase(s:String?){
    val allCaps : String?  = s?.toUpperCase()
    println(allCaps)
}
fun main(){
    printAllUpperCase("abc")
    printAllUpperCase(null)
}