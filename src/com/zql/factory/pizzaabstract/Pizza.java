package com.zql.factory.pizzaabstract;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    abstract void prepare();
    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore " + name);
    }

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
}
