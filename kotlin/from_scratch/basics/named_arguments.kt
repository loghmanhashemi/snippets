fun main (){
    printPersonInfo(lastName="hashemi" , firstName="soorena",age=11,gender="male")
}
fun printPersonInfo(firstName: String, lastName: String, age: Int, gender: String) {
    println("Person info: $firstName $lastName, " + 
        "Age: $age, Gender: $gender")
}