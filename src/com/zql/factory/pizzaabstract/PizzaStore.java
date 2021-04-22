package com.zql.factory.pizzaabstract;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
    //抽象的createPizza方法
    abstract com.zql.factory.pizzaabstract.Pizza createPizza(String type);
}
