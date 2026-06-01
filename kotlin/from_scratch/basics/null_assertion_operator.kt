fun main() {
  val name: String? = "John"
  val length = name!!.length // !! is called double-bang operator or null assertion operator
  // if name actually were null, this snippet would result in a NullPointerException
}



