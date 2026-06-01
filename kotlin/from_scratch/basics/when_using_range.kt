fun main() {
    val hour = 13
    when (hour) {
        in 0..11 -> println("Good morning")
        in 12..16 -> println("Good afternoon")
        in 17..23 -> println("Good evening")
        else -> println("Invalid hour")
    }
}