fun main(args: Array<String>) {
    println({
        val greetingFunction: () -> String = {
            val currentYear = 2018
            "Welcome to SimVillage, Mayor! (copyright $currentYear)"
        }
    })()
    println(greetingFunction())
}