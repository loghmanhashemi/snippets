interface Animal{
    val id : Int
    val name : String
}
open class Cat(override var id: Int) : Animal {
    override var name = "Cat"
    constructor(id:Int,name:String):this(id){
        this.name =name
    }
}
open class Dog(override var id: Int) : Animal {
    override var name = "Dog"
    constructor(id:Int,name:String):this(id){
        this.name =name
    }
}
class PersianCat(id:Int) : Cat(id,"persian cat")
class WildCat(id:Int) : Cat(id,"wild cat")
class Beagle(id : Int) : Dog(id,"beagle")
class Bulldog(id : Int) : Dog(id,"bulldog")
    

class DogFactory{
    fun createDog(breed: String,id:Int) : Animal {
        return when(breed.trim().toLowerCase()) {
            "beagle" -> Beagle(id)
            "bulldog" -> Bulldog(id)
             else -> throw RuntimeException("Unknown dog breed $breed")
        }
    }    
}
class CatFactory{
    fun createCat(breed: String,id:Int) : Animal {
        return when(breed.trim().toLowerCase()) {
            "persian" -> PersianCat(id)
            "wild" -> WildCat(id)
             else -> throw RuntimeException("Unknown dog breed $breed")
        }
    }   
}
class AnimalFactory {
    var counter = 0
    private val dogFactory = DogFactory()
    private val catFactory = CatFactory()
    fun createAnimal(animalType: String,animalBreed :String) : Animal {
        return when(animalType.trim().toLowerCase()) {
            "cat" -> catFactory.createCat(animalBreed,++counter)
            "dog" -> dogFactory.createDog(animalBreed,++counter)
             else -> throw RuntimeException("Unknown animal $animalType")
        }
    }
}
fun main(){
    val animalTypes = listOf("dog" to "bulldog",
                             "dog" to "beagle",
                             "cat" to "persian",
                             "dog" to "beagle",
                             "cat" to "wild")
    val animalFactory = AnimalFactory()
    for( (animal,breed) in animalTypes){
        val c = animalFactory.createAnimal(animal,breed)
        println("${c.id} - ${c.name}")
    }

}