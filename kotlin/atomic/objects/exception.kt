import atomictest.*

fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
    """For input string: "1$""""
    "1$".toIntOrNull() eq null
}