import org.example.decerator.BasicPizza
import org.example.decerator.PizzaWithBacon
import org.example.decerator.PizzaWithChicken
import org.example.decerator.PizzaWithMushrooms
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Decorator {

    @Test
    fun `Get total cost with adding all topping list to pizza then return total cost`(){
        val userPizza = PizzaWithMushrooms(PizzaWithChicken(
            PizzaWithBacon(BasicPizza())))

        assertEquals(8.0, userPizza.cost())
    }

    @Test
    fun `Get description  with adding all topping list to pizza then return full description`(){
        val userPizza = PizzaWithMushrooms(PizzaWithChicken(
            PizzaWithBacon(BasicPizza())))

        assertEquals("BasicPizza Bacon Chicken Mushroom ", userPizza.pizzaDescription())
    }


}