package com.zql.factory.pizzaabstract;


public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        //PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        System.out.println("Ethan ordered a" + pizza.getName() + "\n");

/*        pizza = chicagoStore.orderPizza("chesse");
        System.out.println("Joel ordered a" + pizza.getName()+"\n");*/


    }
}
