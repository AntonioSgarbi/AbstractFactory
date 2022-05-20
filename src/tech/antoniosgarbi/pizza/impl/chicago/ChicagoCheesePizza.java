package tech.antoniosgarbi.pizza.impl.chicago;

import tech.antoniosgarbi.pizza.impl.PizzaChicago;

public class ChicagoCheesePizza extends PizzaChicago {
    @Override
    public void box() {
        System.out.println(""" 
                A pizza de queijo é enxaixotada de de forma a
                garantir que o recheio não grunde na tampa""");
    }

}