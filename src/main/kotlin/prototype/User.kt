package org.example.prototype

// by use Cloneable interface
class User: Cloneable {
    private val name: String = ""
    private val age: Int = 0
    override fun clone(): Any {
        return super.clone()
    }
}

// also by using generated copy() in data class only
data class UserClass(
    val name: String,
    val age: Int
){

}

// by Constructor

class UserCons(val name: String, val age: Int){

    constructor(other: UserCons): this(other.name, other.age){

    }

    fun clone(): UserCons{
        return UserCons(this)
    }
}