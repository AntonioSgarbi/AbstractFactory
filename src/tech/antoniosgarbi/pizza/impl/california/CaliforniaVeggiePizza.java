package tech.antoniosgarbi.pizza.impl.california;

import tech.antoniosgarbi.pizza.impl.PizzaCalifornia;

public class CaliforniaVeggiePizza extends PizzaCalifornia {
    @Override
    public void bake() {
        System.out.println("""
                 A pizza veggie é assada de forma diferente
                para manter a textura dos legumes""");
    }

}