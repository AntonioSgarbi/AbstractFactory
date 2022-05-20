package tech.antoniosgarbi.factory;

import tech.antoniosgarbi.pizza.Pizza;

public interface PizzariaFactory {
    Pizza createPizza(String sabor);

    static PizzariaFactory getFactory(String pizzariaSelecionada) {
        PizzariaFactory pizzaria;
        switch (pizzariaSelecionada) {
            case "Nova York":
                pizzaria = new NovaYorkFactory();
                break;
            case "Chicago":
                pizzaria = new ChicagoFactory();
                break;
            case "Califórnia":
                pizzaria = new CaliforniaFactory();
                break;
            default:
                throw new RuntimeException("Selecione uma pizzaria existente");
        }
        return pizzaria;
    }

}