
abstract class AbstractDungeonMaster(private val gameName : String){
    fun startGame(){
        println("Game $gameName has started")
    }
}
open class DungeonMaster(gameName: String):  AbstractDungeonMaster(gameName)
class EvilDungeonMaster(private val awfulGame: String) : DungeonMaster(awfulGame)
fun main(){
    val evilGame = EvilDungeonMaster("EVIL GAME")
    evilGame.startGame()
}