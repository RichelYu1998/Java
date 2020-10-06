package com.yh;

public class General {
    public static void main(String[] args) {
        String str = String.format("%d", 400 / 2);
        String str2 = String.format("%b", 3 > 5);
        String str3 = String.format("%x", 200);
        System.out.println("400的一半是："+str);
        System.out.println("3大于5："+str2);
        System.out.println("200的十六进制是："+str3);
    }
}
