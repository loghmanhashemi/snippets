enum class DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY, SATURDAY, SUNDAY
}
fun main() {
    
    val today = DayOfWeek.MONDAY
    when (today) {
        DayOfWeek.MONDAY -> println("It's a manic Monday!")
        else -> println("It's some other day.")
    }
}