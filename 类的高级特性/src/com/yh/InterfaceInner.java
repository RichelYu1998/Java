package com.yh;
interface OutInterface{
     void f();
}
public class InterfaceInner {
    public static void main(String[] args) {
        OuterClass2 out = new OuterClass2();
        OutInterface outinter=out.doit();
        outinter.f();
    }
static class OuterClass2 {
        private class InnerClass implements OutInterface{
            public InnerClass(String 访问内部类构造方法) {
            }
            @Override
            public void f() {
                System.out.println("访问内部类的f()方法");
            }
        }
        public OutInterface doit(){
            return new InnerClass("访问内部类构造方法");
        }
    }
}
