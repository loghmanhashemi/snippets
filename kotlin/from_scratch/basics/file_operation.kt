import java.io.File
import java.util.Scanner
fun main() {
    val inputFile = "inputfile.txt"
    try {
        val file = File(inputFile)
        val sc = Scanner(file)
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            println(line)
        }
    } catch (e: Exception) {
        println("An error occurred: ${e.message}")
    }
}