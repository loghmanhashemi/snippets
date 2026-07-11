fun strLenSafe(str: String?):Int = str?.length ?: 0
fun main(){
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}