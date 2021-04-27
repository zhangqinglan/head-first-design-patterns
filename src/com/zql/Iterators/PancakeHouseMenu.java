package com.zql.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;
    public PancakeHouseMenu(){
        menuItems = new ArrayList();
        addItem("KB早餐饼","鸡蛋，吐司",true,2.99);
        addItem("常规早餐饼","鸡蛋，香肠",true,2.99);
        addItem("蓝莓早餐饼","蓝莓",true,3.49);
        addItem("威化饼","蓝莓，三明治",true,3.59);
    }
/*    public Iterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }*/
    //利用java.util.Iterator来清理
    public Iterator createIterator(){
        return menuItems.iterator();
    }
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }
}
