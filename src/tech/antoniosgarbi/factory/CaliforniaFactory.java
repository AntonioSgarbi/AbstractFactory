package tech.antoniosgarbi.factory;

import tech.antoniosgarbi.pizza.impl.PizzaCalifornia;
import tech.antoniosgarbi.pizza.impl.california.*;

public class CaliforniaFactory implements PizzariaFactory {
    @Override
    public PizzaCalifornia createPizza(String sabor) {
        switch (sabor) {
            case "cheese":
                return new CaliforniaCheesePizza();
            case "clam":
                return new CaliforniaClamPizza();
            case "greey":
                return new CaliforniaGreeyPizza();
            case "pepperoni":
                return new CaliforniaPepperoniPizza();
            case "vegie":
                return new CaliforniaVeggiePizza();
            default:
                throw new RuntimeException("Sabor não identificado, tente novamente!");
        }
    }

}