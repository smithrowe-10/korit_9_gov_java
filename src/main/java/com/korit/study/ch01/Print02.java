package com.korit.study.ch01;

public class Print02 {
    public static void main(String[] args) {
        //자바는 카멜,파스칼 표기법

        //선언과 초기화
        int level;
        level = 10;

        int n1 = 10;
        int n2 = 20;
        int n3 = n1 + n2;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(40);

//      long n5 = 2200000000l; O  리터럴
        float fpi = 3.14f;  //리터럴
//      int n5 = 2200000000; X

        final double PI;
        PI = 3.14;

        Boolean isMarried = true;

        // 다운캐스팅 실수 -> 정수 -> 문자
        double n6 = (double) n1 + PI;
        System.out.println(n6);

        // 업캐스팅 문자 -> 정수 -> 실수
        int n7 = (int) PI + n2;
        System.out.println(n7);

        System.out.println(PI + System.lineSeparator());
        System.out.println(n7);

    }
}
