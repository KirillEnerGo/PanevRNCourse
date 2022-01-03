fun main() {
    val user1 = User("Kirill", 23)
    val user2 = User("Olga", 35)

    val maxAgeUser = (getMaxAgeUserName(user1, user2))
    println(user1)
    println(user2)
    println("Максимальный возраст пользователя = ${maxAgeUser.age} и имя : ${maxAgeUser.name}")
}

fun getMaxAgeUserName(user1: User, user2: User): User
{
    val maxAgeUser = when
    {
        user1.age > user2.age -> user1
        else -> user2
    }
    return maxAgeUser
}

data class User(val name: String, val age: Int)