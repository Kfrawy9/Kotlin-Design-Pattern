package org.example.command

class CopyCommand(
    val textEditor: TextEditor,
    var clipboard: Clipboard
): Command {

    override fun execute() {
        clipboard.text = textEditor.copy()
    }

    override fun undo() {
        clipboard.text = ""
    }
}