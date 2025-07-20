package org.example.meditor

interface AirPlaneTower {

    fun registerPlane(plane: AirCraft)
    fun requestLanding(plane: AirCraft)
    fun notifySuccess(plane: AirCraft)

}