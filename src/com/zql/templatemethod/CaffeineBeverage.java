package com.zql.templatemethod;

public abstract class CaffeineBeverage {
    //用同一个prepareRecipe()方法来处理茶和咖啡。
    // 该方法声明为final，因为我们不希望子类覆盖这个方法。
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("煮水");
    }
    void pourInCup(){
        System.out.println("倒入杯中");
    }

}
