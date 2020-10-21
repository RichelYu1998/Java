package com.yh;

class Parent {
    Parent() {
        System.out.println("调用父类的Parent()方法");
    }
}

class SubParent extends Parent {
    SubParent(){
        System.out.println("调用父类的SubParent()方法");
    }
}

public class Subrountine extends SubParent {
    Subrountine(){
        System.out.println("调用父类的Subrountine()方法");
    }

    public static void main(String[] args) {
        Subrountine s = new Subrountine();
    }
}
