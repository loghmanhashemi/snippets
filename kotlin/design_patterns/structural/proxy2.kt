//lazy loading
interface Image {
    fun display()
}

class RealImage(
    private val filename: String
) : Image {

    init {
        println("Loading $filename...")
    }

    override fun display() {
        println("Displaying $filename")
    }
}

class ImageProxy(
    private val filename: String
) : Image {

    private var realImage: RealImage? = null

    override fun display() {
        if (realImage == null) {
            realImage = RealImage(filename)
        }

        realImage!!.display()
    }
}

fun main() {
    val image: Image = ImageProxy("cat.jpg")

    println("Image object created")

    // RealImage is created only here
    image.display()

    // Reuses the existing RealImage
    image.display()
}
