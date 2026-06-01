fun main(){
    loop1@  for( i in 1..5){
        loop2@ for( j in 1..5){
            print("$i,$j ");
            if(i==j)
                break@loop2
        }
        println()
    }

}