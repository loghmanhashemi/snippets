abstract class AbstractDungeonMaster{
    abstract val dungeonName: String
    fun startGame() {
        println("Game $dungeonName started")
    }
}
class MyDungeonMaster : AbstractDungeonMaster(){
    override val dungeonName :String    
        get() = "Dungeon of mine"
}
fun main(){
    val drageon = MyDungeonMaster()
    drageon.startGame()
}