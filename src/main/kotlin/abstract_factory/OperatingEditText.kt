package org.example.abstract_factory

interface OperatingEditText {
    fun draw(): String
    fun onClick()
}

class WindowsET: OperatingEditText{
    override fun draw(): String {
        return "Windows Edit Text"
    }

    override fun onClick() {
    }
}

class LinuxET: OperatingEditText{
    override fun draw(): String {
        return "Linux Edit Text"
    }

    override fun onClick() {
    }
}

class MacET: OperatingEditText{
    override fun draw(): String {
        return "Mac Edit Text"
    }

    override fun onClick() {
    }
}