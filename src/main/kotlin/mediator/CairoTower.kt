package org.example.meditor

class CairoTower: AirPlaneTower {

    val planes: MutableSet<AirCraft> = mutableSetOf()
    private var isTerminalEmpty: Boolean = true

    override fun registerPlane(plane: AirCraft) {
        planes.add(plane)
    }

    override fun requestLanding(plane: AirCraft) {
        if (!isTerminalEmpty) plane.notifyState("Waiting")
        else{
            isTerminalEmpty = false
            plane.notifyState("Landing")
        }
    }

    override fun notifySuccess(plane: AirCraft) {
        isTerminalEmpty = true
        planes.remove(plane)

    }
}