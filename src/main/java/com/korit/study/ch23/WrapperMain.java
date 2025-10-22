package com.korit.study.ch23;

import java.util.ArrayList;

public class WrapperMain {

    public static void main(String[] args) {

        int num = 10;
        Integer num2 = num; // autoBoxing
        int num4 = num2;    // autoUnBoxing

        String numStr1 = Integer.toString(num);
        String numStr2 = "" + num;
        String numStr3 = num2.toString();


    }
}
