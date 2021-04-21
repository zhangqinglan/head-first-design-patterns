package com.zql.factory.pizzas;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredd Mozzarella Chesse");

    }
    @Override
    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
