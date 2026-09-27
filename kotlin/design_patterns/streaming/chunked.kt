fun dbCall(ids: List<Int>){
    if(ids.size > 1000)
        throw RuntimeException("Can't process more than 1000 ids")
    println("handling ${ids[0]} to ${ids[ids.size-1]}")
    // database operation
}
fun manualChaunk(){
    val hugeList = (1..2500).toList()
    val pageSize = 1000
    val pages = hugeList.size / pageSize
    for ( i in 0..pages){
        val from = i*pageSize
        val p = (i+1) * pageSize
        val to = minOf(p,hugeList.size)
        dbCall(hugeList.slice(from until to))
    }
}
fun kotlinChunked(){
    val hugeList = (1..2500).toList()
    val pageSize = 1000
    hugeList.chunked(pageSize){
        dbCall(it)
    }
}
fun unchuncked(){
    val hugeList = (1..2500).toList()
    dbCall(hugeList)
}
fun stream(){
    val hugeList = (1..2500).toList()
    hugeList
        .filter { it > 100 }
        .map { it * 2 }
        .chunked(1000)
        .forEach({dbCall(it)})
}
fun main(){
    manualChaunk()
    kotlinChunked()
    stream()
    unchuncked()
}