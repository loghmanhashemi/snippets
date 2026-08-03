import java.io.File
fun noApply(){
    val menuFile = File("menu-file.txt")
    menuFile.setReadable(true)
    menuFile.setWritable(true)
    menuFile.setExecutable(false)
}
fun apply(){
    val menuFile = File("menu-file.txt").apply{
        menuFile.setReadable(true)
        menuFile.setWritable(true)
        menuFile.setExecutable(false)
    }
}

fun main(){
   
}
