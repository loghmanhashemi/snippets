fun String.reversed(): String {
    return (this as CharSequence).reversed().toString()
}
fun main(){
    println("alex".reversed())
}