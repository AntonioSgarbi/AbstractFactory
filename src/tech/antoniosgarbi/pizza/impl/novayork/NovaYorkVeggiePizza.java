package tech.antoniosgarbi.pizza.impl.novayork;

import tech.antoniosgarbi.pizza.impl.PizzaNovaYork;

public class NovaYorkVeggiePizza extends PizzaNovaYork {
    @Override
    public void bake() {
        System.out.println("""
                 A pizza veggie é assada de forma diferente
                para manter a textura dos legumes""");
    }

}