package org.example.composite

interface View {
    val text: String
    fun onClick()
}

class TextView(override val text: String, val onTextClicked: () -> Unit = {}): View{
    override fun onClick() = onTextClicked()
}

class ButtonView(override val text: String, val onButtonClicked: () -> Unit): View{
    override fun onClick() = onButtonClicked()
}

class ImageView(override val text: String,val url: String,
                val onImageClicked: () -> Unit = {},
    ): View{
    override fun onClick() = onImageClicked()
    fun loadImage(){
        println("Loading image with url: $url")
    }
}

class LinearLayout(val onViewClicked: ()-> Unit = {}): View{
    var views: MutableList<View> = mutableListOf()
    override val text: String = "LinearLayout"
    override fun onClick() = onViewClicked()

    fun load(){
        val sBuilder = StringBuilder()
        views.forEach {
            sBuilder.appendLine(it.text)
        }
        println(sBuilder.toString())
    }

}

fun main() {

    val text = TextView("This is a text")
    val button = ButtonView("Click"){
        // you can use here observer
        println("Button Clicked")
    }
    val imageView = ImageView("My Image", "/myImage.jpg")
    imageView.loadImage()
    val viewGroup = LinearLayout()
    viewGroup.views = mutableListOf<View>(text, button, imageView)
    viewGroup.load()

}








