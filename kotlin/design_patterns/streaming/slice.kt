//unlike go and python slices in kotlin are inclusive at last index
fun main(){
    val numbers = (1..10).toList()
    val sub=numbers.slice(0..3) // index 0  until index 3 ( including 3)
    println(sub) // [1, 2, 3, 4]
}