val seq = generateSequence(1) { it + 1 }
val finiteSequence = generateSequence(1) {
    if (it < 1000) it + 1 else null
}
val anotherFiniteSeq = (1..1000).asSequence()

fun main(){
    seq.take(100).forEach {
        println(it)
    }
    finiteSequence.forEach {
        println(it)
    }
}