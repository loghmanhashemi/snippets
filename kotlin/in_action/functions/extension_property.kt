var StringBuilder.lastChar : Char
    get() = get(length-1)
    set(c: Char) =  setCharAt(length-1,c)

fun main(){
    val sb = StringBuilder("Kotlin")
    sb.lastChar = 'X'
    println(sb)
}