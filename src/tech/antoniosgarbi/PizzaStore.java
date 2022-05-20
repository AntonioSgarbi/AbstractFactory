package tech.antoniosgarbi;

import tech.antoniosgarbi.factory.PizzariaFactory;
import tech.antoniosgarbi.pizza.Pizza;

public class PizzaStore {
    Pizza orderPizza(String pizzaria, String sabor) throws Exception {
        PizzariaFactory pizzariaFactory = PizzariaFactory.getFactory(pizzaria);

        Pizza pizza = pizzariaFactory.createPizza(sabor);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}