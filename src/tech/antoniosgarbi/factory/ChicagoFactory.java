package tech.antoniosgarbi.factory;

import tech.antoniosgarbi.pizza.impl.PizzaChicago;
import tech.antoniosgarbi.pizza.impl.chicago.*;

public class ChicagoFactory implements PizzariaFactory {
    @Override
    public PizzaChicago createPizza(String sabor) {
        switch (sabor) {
            case "cheese":
                return new ChicagoCheesePizza();
            case "clam":
                return new ChicagoClamPizza();
            case "greey":
                return new ChicagoGreeyPizza();
            case "pepperoni":
                return new ChicagoPepperoniPizza();
            case "vegie":
                return new ChicagoVeggiePizza();
            default:
                throw new RuntimeException("Sabor não identificado, tente novamente!");
        }
    }

}