package com.yh;
class Parents{
    final void doit2(){
        System.out.println("父类.doit2()");
    }
    public void doit3(){
        System.out.println("父类.doit3()");
    }
}
class Sub extends Parents{
    public final void doit(){
        System.out.print("子类.doit()");
    }
    public void doit3(){
        System.out.println("子类.doit3()");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.doit();
        Parents p=s;
        p.doit2();
        p.doit3();
    }
}
