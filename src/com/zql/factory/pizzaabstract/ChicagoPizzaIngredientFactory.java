package com.zql.factory.pizzaabstract;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    public Cheese createCheese(){
        return new Mozzarella();
    }
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new BlackOlives(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clams createClam(){
        return new FrozenClams();
    }
}
