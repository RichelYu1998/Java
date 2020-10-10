package com.yh;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
    static public void SimgleFomat(String pattern,double value){
        DecimalFormat myformat = new DecimalFormat();
        String output = myformat.format(value);
        System.out.println(value+" "+pattern+" "+output);
    }
    static public void UseApplyPatternMethodFormat(String pattern,double value){
        DecimalFormat myformat = new DecimalFormat();
        myformat.applyPattern(pattern);
        System.out.println(value+" "+pattern+" "+myformat.format(value));
    }

    public static void main(String[] args) {
        SimgleFomat("###,###.###",123456.789);
        SimgleFomat("000000.000kg",123456.789);
        SimgleFomat("000000.000",123.78);
        UseApplyPatternMethodFormat("#.###%",0.789);
        UseApplyPatternMethodFormat("###.##",123456.789);
        UseApplyPatternMethodFormat("0.00\u2030",0.789);
    }
}
