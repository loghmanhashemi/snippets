/*
Think about Flyweight when you have a huge number of objects + lots of duplicated data
Intrinsic vs extrinsic state: first shared, second not
Flyweight vs Singleton
singleton: There should be one instance
Flyweight: There can be many logical objects, but they share common state:
Object A ──┐
Object B ──┼──→ Shared Flyweight
Object C ──┘
*/
class TreeType(
    val name: String,
    val texture: String,
    val color: String
) {
    fun draw(x: Int, y: Int) {
        println("Drawing $name at ($x, $y)")
    }
}
class Tree(
    private val x: Int,
    private val y: Int,
    private val type: TreeType
) {

    fun draw() {
        type.draw(x, y)
    }
}
class TreeFactory {

    private val treeTypes = mutableMapOf<String, TreeType>()

    fun getTreeType(
        name: String,
        texture: String,
        color: String
    ): TreeType {

        return treeTypes.getOrPut(name) {
            TreeType(name, texture, color)
        }
    }
}
fun main(){
    val factory = TreeFactory()

    val oakType = factory.getTreeType(
        "Oak",
        "oak.png",
        "Green"
    )

    val tree1 = Tree(10, 20, oakType)
    val tree2 = Tree(50, 100, oakType)
    val tree3 = Tree(200, 300, oakType)

    tree1.draw()
    tree2.draw()
    tree3.draw()
}