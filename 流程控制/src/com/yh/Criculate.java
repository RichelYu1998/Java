package com.yh;

public class Criculate {
    public static void main(String[] args) {
        int sum=0;
        for(int i=2;i<=100;i+=2){
            sum=sum+i;
        }
        System.out.println("2到100的偶数和"+sum);
    }
}
