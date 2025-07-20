import org.example.visitor.Cart
import org.example.visitor.ListItem
import org.example.visitor.VisitorImpl
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Visitor {

    @Test
    fun `calculate total item in the cart returns the expected total price`(){
        val cart = Cart()
        cart.cartList.add(ListItem("a", 20))
        cart.cartList.add(ListItem("b", 100))
        cart.cartList.add(ListItem("c", 10))
        cart.cartList.add(ListItem("f", 5))

        val visitor = VisitorImpl()
        val total = cart.accept(visitor)

        assertEquals(135, total)
    }

}