package org.example.state

import builder.User

sealed interface UserState {

   object Anonymous: UserState {
       override fun signUp(email: String, pass: String) {
           println("Handle signup for anonymous user")
       }

       override fun verifyEmail(email: String, token: String) {
           println("Handle verify for anonymous user")
       }

       override fun viewContent() {
           println("Handle view content for anonymous user")
       }

       override fun viewProfile(userId: Int) {
           println("Handle view profile for anonymous user")
       }
   }

    object Unverified: UserState {
        override fun signUp(email: String, pass: String) {
            println("Handle signup for unverified")
        }

        override fun verifyEmail(email: String, token: String) {
            println("Handle verify for unverified")
        }

        override fun viewContent() {
            println("Handle view content for unverified")
        }

        override fun viewProfile(userId: Int) {
            println("Handle view profile for unverified")
        }
    }

    object Authenticated: UserState {
        override fun verifyEmail(email: String, token: String) {
            println("Handle verify email for authenticated")
        }

        override fun viewContent() {
            println("Handle view content for authenticated")
        }

        override fun viewProfile(userId: Int) {
            println("Handle view profile for authenticated")
        }
    }


    fun signUp(email: String, pass: String){}
    fun verifyEmail(email: String, token: String)
    fun viewContent()
    fun viewProfile(userId: Int)


}

fun main() {

    val user = UserState.Anonymous
    user.signUp("ahmed", "123")


}