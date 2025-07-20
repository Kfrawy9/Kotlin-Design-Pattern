package org.example.memento

class TextEditor {

    private var content = ""
    private var contentToSave = ""

    fun save(): Memento{
        val text = contentToSave
        contentToSave = ""
        return Memento(text)
    }

    fun revert(memento: Memento){
        content = content.removeSuffix(memento.text)
    }

    fun addText(text: String){
        content += text
        contentToSave += text
    }

    fun getContent(): String{
        return content
    }

}