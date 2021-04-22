package com.zql.factory.pizzaabstract;
public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("纽约风格奶酪披萨");

        }else if(item.equals("veggie")){

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("纽约风格蔬菜披萨");
        }else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("纽约风格蛤蜊披萨");
        }else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("纽约风格意大利辣香肠披萨");
        }
        return pizza;
    }
}

