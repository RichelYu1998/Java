package com.yh;

public class Division {
    public static void main(String[] args) {
        String str = "192.168.0.1";
        String[] firstArray = str.split("\\. ");
        String[] secondArray = str.split("\\. ", 2);
        System.out.println("str原来的值为：" + "[" + str + "]");
        System.out.print("全部分割的结果为：");
        for (String a : firstArray) {
            System.out.print("[" + a + "]");
        }
        System.out.println();
        System.out.println("分割两次的结果：");
        for (String a : secondArray) {
            System.out.print("["+a+"]");
        }
        System.out.println();
    }
}
