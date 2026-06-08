import java.io.*

fun readNumber(reader: BufferedReader){
    val number = try{
        Integer.parseInt(reader.readLine())
    }
    catch(e: Exception){
        println("not a number")
        return
    }
    println(number)
    
}
fun main(){
    val reader = BufferedReader(StringReader("hi"))
    readNumber(reader)
}