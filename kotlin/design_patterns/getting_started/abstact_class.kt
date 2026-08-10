abstract class AbstractDungeonMaster{
    abstract val dungeonName: String
    fun startGame() {
        println("Game $dungeonName started")
    }
}
class MyDungeonMaster : AbstractDungeonMaster(){
    override val dungeonName = "Dragons ort"
}
fun main(){
    val drageon = MyDungeonMaster()
    drageon.startGame()
}