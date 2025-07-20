import org.example.command.Clipboard
import org.example.command.CommandInvoker
import org.example.command.CopyCommand
import org.example.command.CutCommand
import org.example.command.PasteCommand
import org.example.command.TextEditor
import org.junit.jupiter.api.Test
import javax.print.attribute.standard.Copies
import javax.swing.text.EditorKit
import kotlin.test.assertEquals

class Command {

    @Test
    fun `clipboard copy text from TextEditor then clipboard is equal to content`(){
        val textEditor = TextEditor("Click")
        val clipboard = Clipboard("")
        val invoker = CommandInvoker()

        invoker.execute(CopyCommand(textEditor, clipboard))
        assertEquals(clipboard.text, textEditor.getContent())
    }

    @Test
    fun `clipboard cut text from TextEditor then TextEditor content is Empty`(){
        val textEditor = TextEditor("Click")
        val clipboard = Clipboard("")
        val invoker = CommandInvoker()

        invoker.execute(CutCommand(textEditor, clipboard))
        assertEquals("", textEditor.getContent())
    }

    @Test
    fun `clipboard paste text to empty TextEditor then TextEditor content equal to clipboard`(){
        val textEditor = TextEditor("")
        val clipboard = Clipboard("Copied Data")
        val invoker = CommandInvoker()

        invoker.execute(PasteCommand(textEditor, clipboard))
        assertEquals(clipboard.text, textEditor.getContent())
    }

    @Test
    fun `clipboard undo paste text to empty TextEditor then TextEditor is Empty`(){
        val textEditor = TextEditor("")
        val clipboard = Clipboard("Copied Data")
        val invoker = CommandInvoker()

        invoker.execute(PasteCommand(textEditor, clipboard))
        invoker.undo()
        assertEquals("", textEditor.getContent())
    }

}