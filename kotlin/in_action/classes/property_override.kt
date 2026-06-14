open class User(open val nickname: String)
class PrivateUser(override val nickname: String) : User(nickname)