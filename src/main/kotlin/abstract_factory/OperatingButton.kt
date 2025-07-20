package org.example.abstract_factory

interface OperatingButton {
    fun draw(): String
    fun onClick()
}

class WindowsButton: OperatingButton{
    override fun draw(): String {
        return "Windows Button"
    }

    override fun onClick() {
    }
}

class LinuxButton: OperatingButton{
    override fun draw(): String {
        return "Linux Button"
    }

    override fun onClick() {
    }
}

class MacButton: OperatingButton{
    override fun draw(): String {
        return "Mac Button"
    }

    override fun onClick() {
    }
}