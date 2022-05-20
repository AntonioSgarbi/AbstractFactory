package tech.antoniosgarbi.pizza.impl.chicago;

import tech.antoniosgarbi.pizza.impl.PizzaChicago;

public class ChicagoClamPizza extends PizzaChicago {
    @Override
    public void prepare() {
        System.out.println("""
                A pizza de moluscos pede ingrendientes diferenciados
                para harmonizar com os frutos do mar""");
    }

}