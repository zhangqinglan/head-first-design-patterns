package com.zql.adapterandappearance;
//首先，需要实现想转换成的类型接口，也就是客户期望看到的接口。
public class TurkeyAdapter implements Duck{
    Turkey turkey;
    //需要取得要适配的对象引用，这里利用构造器取得这个引用。
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    //
    public void quack(){
        turkey.gobble();
    }
    public void fly(){
        for(int i=0;i<5;i++){
            turkey.fly();
        }
    }
}
