package org.example.decerator

interface PizzaComponent {
    fun cost(): Double
    fun pizzaDescription(): String
}

class BasicPizza(): PizzaComponent{
    override fun cost(): Double {
        return 5.0
    }

    override fun pizzaDescription(): String {
        return "BasicPizza "
    }
}

class PizzaWithMushrooms(val pizzaComponent: PizzaComponent): PizzaComponent{
    override fun cost(): Double {
        return pizzaComponent.cost() + 0.5
    }

    override fun pizzaDescription(): String {
        return pizzaComponent.pizzaDescription() + "Mushroom "
    }
}

class PizzaWithChicken(val pizzaComponent: PizzaComponent): PizzaComponent{
    override fun cost(): Double {
        return pizzaComponent.cost() + 1.5
    }

    override fun pizzaDescription(): String {
        return pizzaComponent.pizzaDescription() + "Chicken "
    }
}

class PizzaWithBacon(val pizzaComponent: PizzaComponent): PizzaComponent{

    override fun cost(): Double {
        return pizzaComponent.cost() + 1.0
    }

    override fun pizzaDescription(): String {
        return pizzaComponent.pizzaDescription() + "Bacon "
    }
}
