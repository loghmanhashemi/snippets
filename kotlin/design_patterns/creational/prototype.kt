data class Enemy(
    val name: String,
    val health: Int,
    val attack: Int,
    val weapons: List<String>
)

fun main() {

    val prototype = Enemy(
        name = "Orc",
        health = 100,
        attack = 30,
        weapons = listOf("Axe", "Sword")
    )

    val enemy1 = prototype.copy()
    val enemy2 = prototype.copy()
    val enemy3 = prototype.copy(health = 150)

    println(enemy1)
    println(enemy2)
    println(enemy3)
}