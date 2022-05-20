package tech.antoniosgarbi.pizza.impl.chicago;

import tech.antoniosgarbi.pizza.impl.PizzaChicago;

public class ChicagoGreeyPizza extends PizzaChicago {
    @Override
    public void prepare() {
        throw new RuntimeException(
                "Esse sabor não está disponível, selecione outro.");
    }

}