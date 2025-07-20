package org.example.visitor

interface Visitable {
    fun accept(visitor: Visitor): Int
}