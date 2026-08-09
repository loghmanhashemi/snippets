fun getUnixSocketPolling(isBsd : Boolean) = if (isBsd) "kqueue" else "epoll"
fun main(){
    println(getUnixSocketPolling(true))
}