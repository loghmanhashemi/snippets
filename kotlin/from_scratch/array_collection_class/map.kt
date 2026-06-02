fun main(){
    val ages = mapOf("Alice" to 30, "Bob" to 25, "Charlie" to 35)
    val vertices = mutableMapOf("circle" to 0, "triangle" to 3,
        "rectangle" to 4, "pentagon" to 5)

    val bobAge = ages.get("Bob") 
    vertices.put("hexagon", 6)
    vertices.remove("circle")
   
    val testForCircle = vertices.containsKey("circle") // false
    println(bobAge)
    println(vertices)
    println(testForCircle)
}