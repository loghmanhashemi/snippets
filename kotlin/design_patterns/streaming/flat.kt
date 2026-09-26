fun main(){
    val numbers = listOf(
        listOf(1, 2),
        listOf(3, 4),
        listOf(5, 6)
    )

    val result = numbers.flatten()

    println(result) //[1, 2, 3, 4, 5, 6]

    val x = listOf(
        listOf(
            listOf(1, 2),
            listOf(3, 4)
        ),
        listOf(
            listOf(5, 6),
            listOf(7, 8)
        )
    )
    println(x.flatten()) //[[1, 2], [3, 4], [5, 6], [7, 8]]
    println(x.flatten().flatten()) //[1, 2, 3, 4, 5, 6, 7, 8]
}