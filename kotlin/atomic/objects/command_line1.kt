/*
usage: kotlin Command_line1Kt 1 2 3 
output:
1
2
3
*/
fun main(args: Array<String>) {
    for (a in args) {
        println(a)
    }
}