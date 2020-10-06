package com.yh;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        String time= String.format("%tc",date);
        String form= String.format("%tF",date);
        System.out.println("全部时间信息是："+time);
        System.out.println("年-月-日 格式是："+form);
    }
}
