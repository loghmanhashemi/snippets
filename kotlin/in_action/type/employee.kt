class Employee(val name:String,val manager: Employee? )
fun managerName(employee : Employee) = employee.manager?.name
fun main(){
    val alice = Employee("alice",null)
    val bob = Employee("bob",alice)
    println(managerName(bob))
    println(managerName(alice))
}