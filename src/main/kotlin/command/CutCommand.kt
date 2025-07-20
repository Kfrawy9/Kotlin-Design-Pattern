package org.example.command

class CutCommand(
    val textEditor: TextEditor,
    val clipboard: Clipboard,
): Command {

    override fun execute() {
        clipboard.text = textEditor.cut()
    }

    override fun undo() {
        textEditor.paste(clipboard.text)
        clipboard.text = ""
    }
}