package com.zql.Iterators;

import java.util.Iterator;
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("蔬菜 BLT","培根，番茄",true,2.99);
        addItem("BLT","培根，番茄",true,2.99);
        addItem("汤","土豆沙拉",true,3.29);
        addItem("热狗","酸菜",true,3.05);
    }
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("抱歉，菜单已满，不能再添加菜单");

        }else{
            menuItems[numberOfItems]=menuItem;
            numberOfItems = numberOfItems +1;
        }
    }

/*    public MenuItem[] getMenuItems(){
        return menuItems;
    }*/
}
