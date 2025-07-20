package org.example.facade

class FacadeTranslator(
    private val englishTranslator: EnglishTranslator = EnglishTranslator(),
    private val frenchTranslator: FrenchTranslator = FrenchTranslator(),
    private val italianTranslator: ItalianTranslator = ItalianTranslator(),
) {

    fun translate(text: String, lang: Language): String{
        return when(lang){
            Language.English -> englishTranslator.translate(text)
            Language.French -> frenchTranslator.translate(text)
            Language.Italian -> italianTranslator.translate(text)
        }
    }

}