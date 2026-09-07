import kotlin.concurrent.thread
import kotlin.random.Random

data class AverageScore(
    var totalScore: Int = 0,
    var gamesPlayed: Int = 0
) {
    val average: Int
        get() = if (gamesPlayed <= 0)
            0
        else
            totalScore / gamesPlayed
}
fun main(){
    val counter = AverageScore()

    thread(isDaemon = true) {
        while(true) counter.gamesPlayed = 0
    }

    for (i in 1..1_000) {
        counter.totalScore += Random.nextInt(100)
        counter.gamesPlayed++
        println(counter.average)
    }
}
