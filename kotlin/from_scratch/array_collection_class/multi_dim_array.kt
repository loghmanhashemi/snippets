fun main(){
    val numRow = 3
    val numCol = 4
    // Create a (3x4) array.
    val twoDimArray = Array(numRow) {Array(numCol) {0}}
    // Access and modify an element using its indices.
    twoDimArray[2][3] = 99

    val arr2D = arrayOf(
        intArrayOf(0, 1, 1),
        intArrayOf(2, 0, 2),
        intArrayOf(3, 3, 0)
    )
    println(arr2D[2][2]) // output: 0

    val threeDimArray = Array(2) {Array(3) {Array(4) {""}}}
    // Access and modify an element using its indices.
    threeDimArray[1][2][3] = "Hello, world!"

}