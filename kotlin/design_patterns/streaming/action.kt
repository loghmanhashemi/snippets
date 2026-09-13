fun <T> doSomething(input: List<T>, action: (T) -> T): MutableList<T> {
    val result = mutableListOf<T>()
    for (i in input) {
        result.add(action(i))
    }
    return result
}
fun main(){
    val letters = listOf("a", "b", "c", "d")
    println(doSomething(letters) {
        it.toUpperCase()
    })
}