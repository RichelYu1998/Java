package com.yh;

public class AnyThing {
    public AnyThing(){
        this("this调用有参构造方法");
        System.out.println("无参");
    }

    public AnyThing(String name) {
        System.out.println("有参");
    }
}
