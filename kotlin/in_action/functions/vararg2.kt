fun log(level: String, vararg messages: String, enabled: Boolean) {
    if (enabled) {
        messages.forEach {
            println("[$level] $it")
        }
    }
}

fun main() {
    log("INFO", "Started", "Connected", enabled = true)
}