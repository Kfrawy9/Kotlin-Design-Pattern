package org.example.composite

interface Logger {
    fun log(message: String)
}

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println(message)
    }
}

class FileLogger(private val filePath: String) : Logger {
    override fun log(message: String) {
        // Implementation for writing logs to a file
    }
}

class RootLogger(private val loggers: List<Logger>) : Logger {
    override fun log(message: String) {
        loggers.forEach { it.log(message) }
    }
}
