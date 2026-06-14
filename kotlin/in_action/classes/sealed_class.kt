
sealed class Expr{
    class Num(val vlaue:Int) : Expr()
    class Sum(val left:Expr,val right: Expr) : Expr()
}
fun eval(e: Expr) : Int{
    return  when(e){
        is Expr.Num -> e.vlaue
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }
}

fun main(){
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
    
}