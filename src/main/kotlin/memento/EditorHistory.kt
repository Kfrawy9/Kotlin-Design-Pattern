package org.example.memento

import java.util.Stack

class EditorHistory {

    private val texts: Stack<Memento> = Stack()

    fun save(memento: Memento){
        texts.add(memento)
    }

    fun revert(): Memento{
        return texts.pop()
    }

    fun isEmpty(): Boolean{
        return texts.isEmpty()
    }

}