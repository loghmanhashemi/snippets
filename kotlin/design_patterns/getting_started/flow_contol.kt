fun getUnixSocketPolling(isBsd : Boolean) : String {
    val value = if (isBsd) {
        "kqueue"
    } else {
        "epoll"
    }
    return value
}
fun main(){
    println(getUnixSocketPolling(true))
}