package tech.antoniosgarbi.pizza.impl.novayork;

import tech.antoniosgarbi.pizza.impl.PizzaNovaYork;

public class NovaYorkCheesePizza extends PizzaNovaYork {
    @Override
    public void box() {
        System.out.println(""" 
                A pizza de queijo é enxaixotada de de forma a
                garantir que o recheio não grunde na tampa""");
    }

}