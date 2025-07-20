import org.example.facade.EnglishTranslator
import org.example.facade.FacadeTranslator
import org.example.facade.Language
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Facade {

    @Test
    fun `facade translator take string and language returned the translated text`(){
        val facade = FacadeTranslator()
        val result = facade.translate("Desgin Pattern", Language.English)

        assertEquals("English", result)
    }

}