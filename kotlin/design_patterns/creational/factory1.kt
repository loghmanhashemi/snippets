interface Animal{
    val id : Int
    val name : String
}
class Cat(override val id: Int) : Animal {
    override val name = "Cat"
}
class Dog(override val id: Int) : Animal {
    override val name = "Dog"
}

class AnimalFactory {
    var counter = 0
    fun createAnimal(animalType: String) : Animal {
        return when(animalType.trim().toLowerCase()) {
            "cat" -> Cat(++counter)
            "dog" -> Dog(++counter)
             else -> throw RuntimeException("Unknown animal $animalType")
        }
    }
}
fun main(){
    val animalTypes = listOf("dog","dog","cat","dog","cat")
    val animalFactory = AnimalFactory()
    for( t in animalTypes){
        val c = animalFactory.createAnimal(t)
        println("${c.id} - ${c.name}")
    }

}