/* will cause ConcurrentModificationException
It doesn't necessarily mean multiple threads.
Here "concurrent modification" can simply mean:
The collection was modified while an iterator was using it.

*/
fun <T> printAndClear(list: MutableList<T>) {
    for (e in list) {
        println(e)
        list.remove(e)  // ← modification while iterating
    }
}

fun <T> printAndClearInCorrectWay(list: MutableList<T>) {
    val iterator = list.iterator()

    while (iterator.hasNext()) {
        val e = iterator.next()
        println(e)
        iterator.remove()
    }
}
fun main(){
    //printAndClear(mutableListOf("a", "b", "c"))
    printAndClearInCorrectWay(mutableListOf("a", "b", "c"))
}