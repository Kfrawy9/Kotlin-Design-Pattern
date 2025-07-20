package org.example.bridge

interface House {

    val color: Color
    fun show(): String
}

class WoodHouse(override val color: Color): House{

    override fun show(): String {
        return "${color.getColor()} Wood House"
    }
}

class RockHouse(override val color: Color): House{

    override fun show(): String {
        return "${color.getColor()} Wood House"
    }
}