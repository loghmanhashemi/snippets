fun ignoreNulls(s: String?){
    val sNotNull: String = s!! // is s != null assign it else raise an exception
    println(sNotNull.length)
}
fun main(){ 
    ignoreNulls(null) // causes KotlinNullPointerException
    // output: Exception in thread "main" kotlin.KotlinNullPointerException .... 

} 