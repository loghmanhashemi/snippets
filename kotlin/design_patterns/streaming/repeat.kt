fun repeatAll(letters: List<String>): MutableList<String> {
    val repeatedLetters = mutableListOf<String>()
    for (l in letters) {
        repeatedLetters.add(l + l)
    }
    return repeatedLetters
}
fun main(){
    val letters = listOf("a", "b", "c", "d")
    println(repeatAll(letters)) // [aa, bb, cc, dd]
    
}