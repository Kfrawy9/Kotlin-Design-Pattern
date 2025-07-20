package org.example.bridge

interface Color {
    fun getColor(): String
}

class YellowColor: Color{
    override fun getColor(): String {
        return "Yellow"
    }
}

class RedColor: Color{
    override fun getColor(): String {
        return "Red"
    }
}