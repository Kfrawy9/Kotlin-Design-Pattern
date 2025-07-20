package org.example.command

class PasteCommand(
    val textEditor: TextEditor,
    val clipboard: Clipboard,
): Command {

    override fun execute() {
        textEditor.paste(clipboard.text)
    }

    override fun undo() {
        textEditor.delete(clipboard.text)
    }
}