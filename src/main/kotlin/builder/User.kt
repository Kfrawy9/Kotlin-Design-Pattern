package builder

import java.awt.Image

class User private constructor(val userBuilder: Builder) {
    var id: Int? = null
    val firstName: String?
    val lastName: String?
    val age: Int?
    val address: String?


    init {
        this.id = userBuilder.id
        this.firstName = userBuilder.firstName
        this.lastName = userBuilder.lastName
        this.age = userBuilder.age
        this.address = userBuilder.address
    }


    class Builder(firstName: String, lastName: String) {
         var id: Int? = null
            private set
         var firstName: String? = null // required
            private set
         var lastName: String? = null // required
            private set

         var age: Int? = null
            private set
         var address: String? = null
            private set

        fun setAge(age: Int) = apply { this.age = age }
        fun setAddress(address: String) = apply { this.address = address }
        fun build(): User{
            val user = User(this)
            return user
        }
    }
}

fun main() {
    val user = User.Builder("ahmed", "mohamed")
        .setAge(23)
        .build()

    println("${user.age}, ${user.address}")


}