package org.example.bridge

interface OperatingSystem {
    fun doOperation(): String
}

class Windows: OperatingSystem{
    override fun doOperation(): String {
        return "Windows"
    }
}

class Android: OperatingSystem{
    override fun doOperation(): String {
        return "Android"
    }
}

class Linux: OperatingSystem{
    override fun doOperation(): String {
        return "Linux"
    }
}

interface UiActions{
    val os: OperatingSystem
    fun onClick(): String
}

class Button(override val os: OperatingSystem): UiActions{
    override fun onClick(): String{
        return "${os.doOperation()} Button Clicked"
    }
}
