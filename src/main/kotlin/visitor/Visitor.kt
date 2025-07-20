package org.example.visitor

interface Visitor {

    fun visit(listItem: ListItem): Int
    fun visit(cart: Cart): Int
}

class VisitorImpl: Visitor{
    override fun visit(listItem: ListItem): Int {
        return listItem.price
    }

    override fun visit(cart: Cart): Int {
        var price = 0
        cart.cartList.forEach {
            price = price + it.accept(this)
        }

        return price
    }
}