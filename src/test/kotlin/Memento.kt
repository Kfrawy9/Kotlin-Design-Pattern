import org.example.memento.EditorHistory
import org.example.memento.TextEditor
import org.testng.annotations.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class Memento {

    @Test
    fun `save text to history stack then history stack not empty`(){
        val editor = TextEditor()
        val editorHistory = EditorHistory()
        editor.addText("name ")
        editor.addText("ahmed")
        val memento = editor.save()

        editorHistory.save(memento)
        assertFalse(editorHistory.isEmpty())
    }

    @Test
    fun `save text and revert it from history`(){

        val editor = TextEditor()
        val editorHistory = EditorHistory()
        editor.addText("name: ")
        editor.addText("ahmed,")
        val memento = editor.save()
        editorHistory.save(memento)
        editor.addText("age: ")
        editor.addText("24,")
        val m2 = editor.save()
        editorHistory.save(m2)
        editor.revert(editorHistory.revert())

        assertEquals("name: ahmed,", editor.getContent())
    }

}