package com.zql.Iterators;
import java.util.Iterator;
public class Waitress {
/*    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("菜单\n----\n早餐");
        printMenu(pancakeIterator);
        System.out.println("\n午餐");
        printMenu(dinerIterator);
    }*/

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    //接入咖啡厅
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu,Menu dinerMenu,Menu cafeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;

    }
    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("菜单\n----\n早餐");
        printMenu(pancakeIterator);
        System.out.println("\n午餐");
        printMenu(dinerIterator);

        System.out.println("\n晚餐");
        printMenu(cafeIterator);
    }
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName()+",");
            System.out.println(menuItem.getPrice()+"--");
            System.out.println(menuItem.getDescription());
        }
    }
}
