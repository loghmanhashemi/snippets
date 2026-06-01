fun main() {
    var str_null_allowed: String? = "hello world" // valid initialization
    str_null_allowed = null // reassigned to null, no compilation error

    var str_null_not_allowed: String = "Hello, world!" // valid initialization
    str_null_not_allowed = null // invalid, will result in compilation error
}

