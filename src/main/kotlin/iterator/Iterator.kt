package org.example.iterator

import java.util.Objects

interface Iterator {

    fun hasNext(): Boolean
    fun next(): Any

}