package tech.antoniosgarbi.pizza.impl.novayork;

import tech.antoniosgarbi.pizza.impl.PizzaNovaYork;

public class NovaYorkGreeyPizza extends PizzaNovaYork {
    @Override
    public void prepare() {
        throw new RuntimeException(
                "Esse sabor não está disponível, selecione outro.");
    }

}