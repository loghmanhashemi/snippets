/*
Represent a language or grammar as a collection of objects, and use those objects to 
interpret/evaluate expressions written in that language.

*/

interface Expression {
    fun interpret(): Int
}
class NumberExpression(
    private val value: Int
) : Expression {

    override fun interpret(): Int = value
}
class AddExpression(
    private val left: Expression,
    private val right: Expression
) : Expression {

    override fun interpret(): Int =
        left.interpret() + right.interpret()
}
fun main(){
    val expression =
    AddExpression(
        NumberExpression(5),
        NumberExpression(3)
    )

    println(expression.interpret())
}