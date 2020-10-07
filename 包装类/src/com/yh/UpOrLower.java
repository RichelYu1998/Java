package com.yh;

public class UpOrLower {
    public static void main(String[] args) {
        Character a = new Character('A');
        Character b = new Character('a');
        System.out.println(a+"是大写字母吗？"+Character.isUpperCase(a));
        System.out.println(b+"是小写字母吗？"+Character.isLowerCase(b));
    }
}
