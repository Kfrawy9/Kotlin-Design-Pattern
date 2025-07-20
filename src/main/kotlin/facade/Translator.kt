package org.example.facade

enum class Language{
    English,
    French,
    Italian,
}

interface Translator {
    fun translate(text: String): String
}

// strategy pattern
class EnglishTranslator : Translator{
    override fun translate(text: String): String {
        return "English"
    }
}

class FrenchTranslator : Translator{
    override fun translate(text: String): String {
        return "French"
    }
}

class ItalianTranslator : Translator{
    override fun translate(text: String): String {
        return "Italian"
    }
}



