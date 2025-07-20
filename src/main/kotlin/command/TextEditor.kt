package org.example.command

class TextEditor(initialText: String) {

    private var content: String = initialText

    fun cut(): String{
        val cutText = content
        content = ""
        return content
    }

    fun copy(): String{
        return content
    }

    fun paste(text: String){
        content += text
    }

    fun delete(text: String){
        content = content.removeSuffix(text)
    }

    fun getContent(): String{
        return content
    }


}