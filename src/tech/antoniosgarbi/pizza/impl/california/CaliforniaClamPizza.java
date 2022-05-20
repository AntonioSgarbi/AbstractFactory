package tech.antoniosgarbi.pizza.impl.california;

import tech.antoniosgarbi.pizza.impl.PizzaCalifornia;

public class CaliforniaClamPizza extends PizzaCalifornia {
    @Override
    public void prepare() {
        System.out.println("""
                A pizza de moluscos pede ingrendientes diferenciados
                para harmonizar com os frutos do mar""");
    }

}