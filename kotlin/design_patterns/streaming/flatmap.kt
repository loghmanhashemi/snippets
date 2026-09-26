/*
The simplest way to understand flatMap() is:
For each element, produce a collection, then combine all those collections into one collection.


 */
 val numbers = listOf(1, 2, 3)

val listOfLists = listOf(listOf(1, 2),
    listOf(3, 4, 5), listOf(6, 7, 8))

fun main(){
    
    val result = numbers.flatMap { n ->
        listOf(n, n * 10)
    }
    /*
    1 → [1, 10]
    2 → [2, 20]
    3 → [3, 30]

     */

    println(result)

    println(listOfLists.flatMap { 
        it
    })
    // [1, 2, 3, 4, 5, 6, 7, 8]

    println(listOfLists.flatMap {
        it.asReversed()
    })
    //[2, 1, 5, 4, 3, 8, 7, 6]
    println(listOfLists.flatMap {
        it.map{it.toDouble()}}
    )
    //[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0]
    println(listOfLists.flatMap {
        it.map{it}}
    )
}