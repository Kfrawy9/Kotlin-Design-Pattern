package org.example.visitor

data class ListItem(
    val name: String,
    val price: Int,
): Visitable{
    override fun accept(visitor: Visitor): Int {
       return visitor.visit(this)
    }
}
