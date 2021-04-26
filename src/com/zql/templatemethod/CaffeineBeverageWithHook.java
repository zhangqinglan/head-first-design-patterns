package com.zql.templatemethod;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        //增加判断条件
        //addCondiments();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("煮水");
    }
    void pourInCup(){
        System.out.println("倒入杯中");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
