package tech.antoniosgarbi.pizza.impl.california;

import tech.antoniosgarbi.pizza.impl.PizzaCalifornia;

public class CaliforniaCheesePizza extends PizzaCalifornia {
    @Override
    public void box() {
        System.out.println(""" 
                A pizza de queijo é enxaixotada de de forma a
                garantir que o recheio não grunde na tampa""");
    }

}