fun max1(a:Int,b:Int) =  if(a>b) a else b //type inference
fun max2(a:Int,b:Int): Int { //no type inference
    return if(a>b) a else b
}  
fun main(){
    println(max1(1,2))
    println(max2(1,2))
}