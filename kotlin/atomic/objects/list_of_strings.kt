import atomictest.eq
fun main() {
    val doubles =
    listOf(1.1, 2.2, 3.3, 4.4)
    doubles.sum() eq 11.0

    val strings = listOf("Twas", "Brillig","And", "Slithy", "Toves")
    strings eq listOf("Twas", "Brillig", "And", "Slithy", "Toves")
    strings.sorted() eq listOf("And","Brillig", "Slithy", "Toves", "Twas")
    strings.reversed() eq listOf("Toves","Slithy", "And", "Brillig", "Twas")
    strings.first() eq "Twas"
    strings.takeLast(2) eq listOf("Slithy", "Toves")
}
/*
11.0
[Twas, Brillig, And, Slithy, Toves]
[And, Brillig, Slithy, Toves, Twas]
[Toves, Slithy, And, Brillig, Twas]
Twas
[Slithy, Toves]

 */