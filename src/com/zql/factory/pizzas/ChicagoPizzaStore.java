package com.zql.factory.pizzas;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item){
        if(item.equals("chesse")){
            return new ChicagoStyleCheesePizza();

        }else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();

        }else if(item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else return null;

    }
}
