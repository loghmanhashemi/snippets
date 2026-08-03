fun main(){
    val nameTooLong = with("Polarcubis, Supreme Master of NyetHack") {
        length >= 20
    }
    println(nameTooLong)
}