package com.yh;

public class GetTerm {
    public static void main(String[] args) {
        int x=20;
        if(x>30){
            System.out.println("a大于30");
        }else if(x>10){
            System.out.println("a大于10但是小于30");
        }else if(x>0){
            System.out.println("a大于0但小于10");
        }else {
            System.out.println("a小于0");
        }
    }
}
