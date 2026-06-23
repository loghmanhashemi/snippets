import java.lang.StringBuilder
fun alphabet1():String{
   val result = StringBuilder()
   for(ch in 'A'..'Z')
      result.append(ch)
   result.append("\nHere I am")   
   return result.toString()
}
fun alphabet2():String{
   val result = StringBuilder()
   return with (result){
      for( ch in 'A'..'Z')
         append(ch)
      append("\nHere I am")
      toString()
   }
}
fun alphabet3():String{
   val result = StringBuilder()
   return with (result){
      for( ch in 'A'..'Z')
         this.append(ch)
      this.append("\nHere I am")
      this.toString()
   }
}
fun main(){
   println(alphabet1())
   println(alphabet2())
   println(alphabet3())
}