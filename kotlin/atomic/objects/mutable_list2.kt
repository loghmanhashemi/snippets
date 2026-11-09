// Lists/MutListIsList.kt
import atomictest.eq
fun getListMut(): MutableList<Int> {
    return mutableListOf(1, 2, 3)
}
fun getListImm(): List<Int> {
    return mutableListOf(1, 2, 3)
}
fun main() {
    // getList() produces a read-only List:
    val listMut = getListMut()
    val listImm = getListImm()
    listMut +=4 //ok
    //listImm += 3 // Error
    listImm eq listOf(1, 2, 3)
    listMut eq listOf(1, 2, 3,4)
}
/*
[1, 2, 3]
[1, 2, 3, 4]
 */