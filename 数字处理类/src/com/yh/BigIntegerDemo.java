package com.yh;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("4");
        System.out.println("加法操作："+bigInteger.add(new BigInteger("2")));
        System.out.println("减法操作："+bigInteger.subtract(new BigInteger("2")));
        System.out.println("乘法操作："+bigInteger.multiply(new BigInteger("2")));
        System.out.println("除法操作："+bigInteger.divide(new BigInteger("2")));
        System.out.println("取商操作："+bigInteger.divideAndRemainder(new BigInteger("3"))[0]);
        System.out.println("取余数操作："+bigInteger.divideAndRemainder(new BigInteger("3"))[1]);
        System.out.println("做2次方操作："+bigInteger.pow(2));
        System.out.println("相反数操作："+bigInteger.negate());
    }
}
