package tech.antoniosgarbi.factory;

import tech.antoniosgarbi.pizza.impl.PizzaNovaYork;
import tech.antoniosgarbi.pizza.impl.novayork.*;

public class NovaYorkFactory implements PizzariaFactory {
    @Override
    public PizzaNovaYork createPizza(String sabor) {
        switch (sabor) {
            case "cheese":
                return new NovaYorkCheesePizza();
            case "clam":
                return new NovaYorkClamPizza();
            case "greey":
                return new NovaYorkGreeyPizza();
            case "pepperoni":
                return new NovaYorkPepperoniPizza();
            case "vegie":
                return new NovaYorkVeggiePizza();
            default:
                throw new RuntimeException("Sabor não identificado, tente novamente!");
        }
    }

}