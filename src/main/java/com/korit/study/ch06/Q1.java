package com.korit.study.ch06;

import java.util.Date;

public class Q1 {
    public static void main(String[] args) {

        hello();
        hello("서민재");

        int n1 = square(4);
        System.out.println(n1);


        String s1 = isNowTime(11, 39);
        System.out.println(s1);

    }

    public static void hello() {
        System.out.println("안녕하세요~");
    }

    public static void hello (String name) {
        System.out.printf("안녕하세요, %s님!" + System.lineSeparator() , name);
    }

    public static int square (int num) {
        return num * num;
    }

    public static String isNowTime(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();

        return hours == nowHours && minutes == nowMinutes ? "현재 시간입니다" : "현재 시간이 아닙니다.";
    }

}

