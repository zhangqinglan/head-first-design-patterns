package com.zql.templatemethod;

public class Coffee extends CaffeineBeverage{
    public void brew(){
        System.out.println("通过过滤器滴滤咖啡");
    }
    public void addCondiments(){
        System.out.println("加入糖和牛奶");
    }
}
