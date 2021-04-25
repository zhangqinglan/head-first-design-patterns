package com.zql.adapterandappearance;

public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("火鸡说......");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n鸭子说......");
        testDuck(duck);
        System.out.println("\n火鸡适配器说......");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
