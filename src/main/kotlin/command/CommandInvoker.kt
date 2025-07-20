package org.example.command

import java.util.Stack

class CommandInvoker {
    val commands = Stack<Command>()

    fun execute(command: Command){
        commands.add(command)
        command.execute()
    }

    fun undo(){
        if (commands.isNotEmpty())
            commands.pop().undo()
    }

}