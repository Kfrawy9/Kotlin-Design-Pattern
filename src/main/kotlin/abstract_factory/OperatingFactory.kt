package org.example.abstract_factory

import org.example.bridge.Linux

interface OperatingFactory {

    fun createButton(): OperatingButton
    fun createTextBox(): OperatingEditText

}

class WindowsFactory: OperatingFactory{
    override fun createButton(): OperatingButton {
        return WindowsButton()
    }

    override fun createTextBox(): OperatingEditText {
        return WindowsET()
    }
}

class MacFactory: OperatingFactory{
    override fun createButton(): OperatingButton {
        return MacButton()
    }

    override fun createTextBox(): OperatingEditText {
        return MacET()
    }
}

class LinuxFactory: OperatingFactory{
    override fun createButton(): OperatingButton {
        return LinuxButton()
    }

    override fun createTextBox(): OperatingEditText {
        return LinuxET()
    }
}