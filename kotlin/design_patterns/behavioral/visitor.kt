/*
Visitor lets you add new operations to a group of existing objects without 
modifying those objects. The core idea is: 

    "Separate the data structure from the operations performed on it"

Visitor is closely related to the idea of multiple dispatch, especially double dispatch.
the first dispatch determines which element, the second dispatch determines which operation.

so:
    "Visitor ≈ a technique for achieving double dispatch in single-dispatch OOP languages."

Imagine you have different types of elements:    
    Document
    ├── Paragraph
    ├── Image
    └── Table

And you want to perform different operations on them:
    Operations:
    ├── Export to HTML
    ├── Export to PDF
    ├── Calculate statistics
    └── Spell checking

Without Visitor, you might put all these operations into the element classes.
 */
 interface DocumentElement {
    fun accept(visitor: Visitor)
}
class Paragraph(val text: String) : DocumentElement {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}

class Image(val filename: String) : DocumentElement {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
interface Visitor {
    fun visit(paragraph: Paragraph)
    fun visit(image: Image)
}
class HtmlExporter : Visitor {
    override fun visit(paragraph: Paragraph) {
        println("<p>${paragraph.text}</p>")
    }

    override fun visit(image: Image) {
        println("<img src='${image.filename}'>")
    }
}
class Statistics : Visitor {
    override fun visit(paragraph: Paragraph) {
        println("Paragraph: ${paragraph.text.length} characters")
    }

    override fun visit(image: Image) {
        println("Image: ${image.filename}")
    }
}
fun main(){
    val document = listOf(
    Paragraph("Hello"),
    Image("photo.jpg")
    )

    val exporter = HtmlExporter()

    for (element in document) {
        element.accept(exporter)
}
}