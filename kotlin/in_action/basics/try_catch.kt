import java.io.*
fun readNumber(reader: BufferedReader): Int?{
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch(e: NumberFormatException){
        return null;
    }
}
fun main(){
    val reader = BufferedReader(StringReader("123"))
    println(readNumber(reader))
}