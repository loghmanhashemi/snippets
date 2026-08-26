interface FileSystemItem {
    fun show()
}

class File(
    private val name: String
) : FileSystemItem {

    override fun show() {
        println("File: $name")
    }
}

class Directory(
    private val name: String
) : FileSystemItem {

    private val children = mutableListOf<FileSystemItem>()

    fun add(item: FileSystemItem) {
        children.add(item)
    }

    override fun show() {
        println("Directory: $name")

        for (child in children) {
            child.show()
        }
    }
}

fun main(){
    val file1 = File("a.txt")
    val file2 = File("b.txt")

    val documents = Directory("Documents")

    documents.add(file1)
    documents.add(file2)

    documents.show()
}