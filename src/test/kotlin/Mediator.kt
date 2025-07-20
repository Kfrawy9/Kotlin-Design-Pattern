import org.example.meditor.AirBus
import org.example.meditor.AirPlaneTower
import org.example.meditor.CairoTower
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Mediator {
    
    @Test
    fun `plane request to land from tower then tower notify with state landing`(){
        val airTower = CairoTower()
        val airbus = AirBus()
        airbus.setAirTower(airTower)
        airbus.requestLanding()
        assertEquals("Landing", airbus.getState())
    }

    @Test
    fun `plane request to land from tower then tower notify with state Waiting`(){
        val airTower = CairoTower()
        val airbus = AirBus()
        val airbus2 = AirBus()
        airbus.setAirTower(airTower)
        airbus2.setAirTower(airTower)
        airbus.requestLanding()
        // i should here call airbus.notifyLandingSuccess to let other plane update their state to Landing
        airbus2.requestLanding()
        assertEquals("Waiting", airbus2.getState())
    }
    
}