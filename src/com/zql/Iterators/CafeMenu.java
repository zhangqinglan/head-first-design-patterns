package com.zql.Iterators;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();
    public CafeMenu(){
        menuItems = new Hashtable();
        addItem("A咖啡","咖啡",true,2.99);
        addItem("B咖啡","咖啡",true,2.99);
        addItem("C咖啡","咖啡",true,3.49);
        addItem("D咖啡","咖啡",true,3.59);
    }
    public Iterator createIterator(){
        return menuItems.values().iterator();
    }
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }
}
