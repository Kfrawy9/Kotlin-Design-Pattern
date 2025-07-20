package org.example.meditor

interface AirCraft {

    fun notifyState(msg: String)
    fun requestLanding()
    fun notifyLandingSuccess()
    fun getState(): String

}