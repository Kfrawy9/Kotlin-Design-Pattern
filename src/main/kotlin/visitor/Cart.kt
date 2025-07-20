package org.example.visitor

class Cart: Visitable{

     val cartList: MutableList<ListItem> = ArrayList()

    fun addListItem(listItem: ListItem){
        cartList.add(listItem)
    }

    fun removeListItem(listItem: ListItem){
        cartList.add(listItem)
    }

    override fun accept(visitor: Visitor): Int  {
        return visitor.visit(this)
    }
}