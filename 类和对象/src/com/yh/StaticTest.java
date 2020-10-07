package com.yh;

public class StaticTest {
    final static double Pi=3.14;
    static int id;
    public static void method1(){

    }
    public void method2(){
        System.out.println(StaticTest.Pi);
        System.out.println(StaticTest.id);
        StaticTest.method1();
    }
}
