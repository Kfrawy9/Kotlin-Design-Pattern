import org.example.abstract_factory.MacFactory
import org.example.abstract_factory.WindowsFactory
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AbstractFactory {
    @Test
     fun `draw windows button with factory of type windows`(){
         val button = WindowsFactory().createButton()
         val result = button.draw()

         assertEquals("Windows Button", result)
     }

    @Test
    fun `draw Mac EditText with factory of type windows`(){
        val et = MacFactory().createTextBox()
        val result = et.draw()

        assertEquals("Mac Edit Text", result)
    }


}