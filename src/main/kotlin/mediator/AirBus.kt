package org.example.meditor

class AirBus: AirCraft {

    private lateinit var airTower: AirPlaneTower
    private var state: String = "Waiting"
    fun setAirTower(airPlaneTower: AirPlaneTower){
        this.airTower = airPlaneTower
        airTower.registerPlane(this)
    }

    override fun notifyState(state: String){
        this.state = if (state != this.state) "Landing" else this.state
    }

    override fun getState(): String {
        return state
    }

    override fun requestLanding() {
        airTower.requestLanding(this)
    }

    override fun notifyLandingSuccess() {
        airTower.notifySuccess(this)
    }
}