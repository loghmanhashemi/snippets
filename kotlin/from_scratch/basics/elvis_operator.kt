fun main() {
   val str: String? = "Hello, world!"
   val len = str?.length ?: -1 // //if (str.length != null) str.length else -1 
   // ?: is elvis operator and used in conjunction with safe call operator (?.)
}

