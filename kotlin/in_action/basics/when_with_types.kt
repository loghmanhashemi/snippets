interface Expr
class Sum(val left:Expr,val right:Expr) :Expr
class Num(val value:Int):Expr
fun eval(e:Expr):Int =
    when (e){
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw Exception("invalid type")
    }
