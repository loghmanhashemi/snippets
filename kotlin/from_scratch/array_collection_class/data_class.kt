/*
a data class can automatically generate a number of methods, including:

equals()
     Compares two data class instances for equality.
toString() 
    Returns a human-readable string representation of the object.
copy() 
    Creates a shallow copy of the data class instance. 
hashCode() 
    Generates a hash code, a unique integer based on a hashing algorithm applied to one or more properties of a class. This method is used
    in conjunction with equals() to determine if two objects are equivalent.
*/
data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Steve", 40)
    println(person)
}