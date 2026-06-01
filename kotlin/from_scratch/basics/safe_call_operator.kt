fun main() {
   val str: String? = "Hello, world!"
   val len1 = if (str != null) str.length else -1 // strlen or -1
   val len2 = str?.length //if (str != null) str.length else null 
   //?. is safe call operator
}

