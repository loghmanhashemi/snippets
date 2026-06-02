fun main(){
    val list = listOf(1,2,3,4) // order is important, redundancy allowed
    val names = listOf("alice","bob","rose") // read only
    println(names[1]) //bob
    println(names.first())//alice
    println(names.last())//rose

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    mutableList.removeAt(1) 
    mutableList[0] = 5
    println(mutableList) // 5,3,4
}