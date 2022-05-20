package tech.antoniosgarbi.pizza.impl.chicago;

import tech.antoniosgarbi.pizza.impl.PizzaChicago;

public class ChicagoVeggiePizza extends PizzaChicago {
    @Override
    public void bake() {
        System.out.println("""
                 A pizza veggie é assada de forma diferente
                para manter a textura dos legumes""");
    }

}