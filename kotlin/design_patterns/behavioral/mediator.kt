/*
Instead of objects communicating directly with each other, they communicate through a central mediator.
 */
interface ChatMediator {
    fun send(message: String, sender: User)
    fun addUser(user: User)
}
class ChatRoom : ChatMediator {

    private val users = mutableListOf<User>()

    override fun addUser(user: User) {
        users.add(user)
    }

    override fun send(message: String, sender: User) {
        for (user in users) {
            if (user != sender) {
                user.receive(message)
            }
        }
    }
}
class User(
    private val name: String,
    private val mediator: ChatMediator
) {
    fun send(message: String) {
        mediator.send(message, this)
    }

    fun receive(message: String) {
        println("$name received: $message")
    }
}

fun main(){
    val chatRoom = ChatRoom()

    val alice = User("Alice", chatRoom)
    val bob = User("Bob", chatRoom)
    val charlie = User("Charlie", chatRoom)

    chatRoom.addUser(alice)
    chatRoom.addUser(bob)
    chatRoom.addUser(charlie)

    alice.send("Hello!")
}