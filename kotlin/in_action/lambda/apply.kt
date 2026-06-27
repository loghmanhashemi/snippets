import java.lang.StringBuilder
fun alphabet() = StringBuilder().apply{
   for ( ch in 'A'..'Z')
      append(ch)
   append("\nHere I am! Apply!")
}.toString()
fun main(){
   println(alphabet())
   var a = StringBuilder().apply{
   for ( ch in 'A'..'Z')
      append(ch)
   append("\nHere I am! Apply!")
   }.toString()
   println(a)
   
}
