package tech.antoniosgarbi.pizza.impl.california;

import tech.antoniosgarbi.pizza.impl.PizzaCalifornia;

public class CaliforniaGreeyPizza extends PizzaCalifornia {
    @Override
    public void prepare() {
        throw new RuntimeException(
                "Esse sabor não está disponível, selecione outro.");
    }

}