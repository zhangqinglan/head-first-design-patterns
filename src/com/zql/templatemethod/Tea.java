package com.zql.templatemethod;

public class Tea extends CaffeineBeverage{
    public void brew(){
        System.out.println("浸泡茶");
    }
    public void addCondiments(){
        System.out.println("加入柠檬");
    }
}
