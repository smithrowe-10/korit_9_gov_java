package com.korit.study.ch04;

import java.sql.SQLOutput;

public class Controller01 {
    public static void main(String[] args) {

        int num = 10;

        String text = num > 5 ? "5보다 큽니다." : "5이하 입니다.";
        System.out.println(text);
        if (num > 5) {
            System.out.println("5보다 큽니다");
        } else {
            System.out.println("5이하 입니다.");
        }

        int score = 85;

        if (score >= 95)
            System.out.println("A+");
         else if (score >= 90)
            System.out.println("A");
         else if (score >= 85)
            System.out.println("B+");
         else
            System.out.println("B");


        if (score > 50) System.out.println("50보다 큽니다"); // 명령이 하나뿐이라면 중괄호가 필요 없  음
        else System.out.println("50이하 입니다.");


    }
}