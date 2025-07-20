package org.example.decorator

import org.example.decorator.BasicLogger
import java.time.Clock
import java.util.Date
import java.util.UUID
import kotlin.math.log

fun interface Logger {
    fun log(msg: String)
}

val BasicLogger = Logger{message -> println(message) }

/*val Logger.withThreadName: Logger
    get() = Logger{ log("$it (on ${Thread.currentThread().name}) ") }
val Logger.withDate: Logger
    get() = Logger{ log("${Date().time} $it") }
val Logger.withUniqueId: Logger
    get() = Logger{ log("${UUID.randomUUID()} $it") }*/

fun Logger.withThreadName() = Logger{ log("$it (on ${Thread.currentThread().name}) ") }
fun Logger.withDate(clock: Clock = Clock.systemDefaultZone()) = Logger{ log("${clock.millis()} $it") }
fun Logger.withUniqueId() = Logger{ log("${UUID.randomUUID()} $it") }

fun main() {

    val logger = BasicLogger.withThreadName().withUniqueId().withDate()
    logger.log("Test Logger")

}