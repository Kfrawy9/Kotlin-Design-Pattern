import org.example.bridge.RedColor
import org.example.bridge.WoodHouse
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Bridge {

    @Test
    fun `get type and color of house then return non empty type and color of the house`(){
        val home = WoodHouse(RedColor())

        assertEquals("Red Wood House", home.show())
    }

}