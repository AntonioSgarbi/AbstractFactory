package tech.antoniosgarbi.pizza.impl.novayork;

import tech.antoniosgarbi.pizza.impl.PizzaNovaYork;

public class NovaYorkClamPizza extends PizzaNovaYork {
    @Override
    public void prepare() {
        System.out.println("""
                A pizza de moluscos pede ingrendientes diferenciados
                para harmonizar com os frutos do mar""");
    }

}