fun main(){
    val readonlySet = setOf(1, 2, 3, 4, 5, 3)//order not important and redundancy not allowd
    val mutableSet = mutableSetOf("apple", "apple","banana", "cherry")
    mutableSet.add("orange")
    println(readonlySet)
    println(mutableSet)
    // set operations
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(3, 4, 5)
   
    val unionSet = set1.union(set2)
    val intersectionSet = set1.intersect(set2)
    val differenceSet = set1.subtract(set2)
    println(unionSet)
    println(intersectionSet)
    println(differenceSet)
}