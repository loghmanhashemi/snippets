fun printNames(vararg names: String) {
    for (name in names) {
        println(name)
    }
}

fun main() {
    printNames("Alice", "Bob", "Charlie")
}