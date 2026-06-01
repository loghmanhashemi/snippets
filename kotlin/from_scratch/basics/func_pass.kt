fun printMessage(message:String){
    println(message)
}
fun main(){
    applyFunction(::printMessage,"hello")
}
fun applyFunction(function: (String) -> Unit, input:String ){
    function(input);
}