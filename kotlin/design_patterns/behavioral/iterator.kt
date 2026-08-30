// Iterator
interface MyIterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}

// Collection
class BookCollection(private val books: List<String>) {

    fun iterator(): MyIterator<String> {
        return object : MyIterator<String> {
            private var index = 0

            override fun hasNext(): Boolean {
                return index < books.size
            }

            override fun next(): String {
                return books[index++]
            }
        }
    }
}

// Client
fun main() {
    val books = BookCollection(
        listOf("Clean Code", "Design Patterns", "Kotlin in Action")
    )

    val iterator = books.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}