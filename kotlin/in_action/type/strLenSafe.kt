fun strLenSafe(str: String?):Int = str?.length ?: 0
fun main(){
    println(strLenSafe("abc"))//3
    println(strLenSafe(null))//0
}