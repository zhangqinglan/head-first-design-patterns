package com.zql.templatemethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        // write your code here
        TeaWithHook teaHook  = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n泡茶......");
        teaHook.prepareRecipe();

        System.out.println("泡咖啡......");
        coffeeHook.prepareRecipe();
    }
}
