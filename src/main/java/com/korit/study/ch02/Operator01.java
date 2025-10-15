package com.korit.study.ch02;

public class Operator01 {
    /**
     * 산술, 논리, 비교, 부호, 관계, 증감, 조건, 복합 대입 연산자에 대해 학습
     */
    public static void main(String[] args) {

//      산술연산
        int n1 = 10;
        int n2 = 5;
        int r1 = n1 + n2;
        System.out.println(r1);

//      문자열 더하기
        String text1 = "문자열";
        String text2 = "합치기";
        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println("문자열2" + "\t" + "합치기2" + text1 + ": " + r1);

//      연산으로 인한 캐스팅 (무조건 상위자료형의 자료형을 따라간다 업캐스팅)
        double n3 = 2.1;
        int n4 = 10;
        System.out.println(n3 + n4);

        String n5 = "" + 2.1;
        System.out.println(n5);
        double n6 = 10.12;
        double n7 = Double.parseDouble(n5) + n6;
        System.out.println(n7);
        System.out.println();
        System.out.println(10 + 'a');
        System.out.println((char) (10 + 'a'));
        System.out.println(10 + "a");
        System.out.println("" + 'a' + 'b');
        System.out.println('a' + 'b' + "");

//      나머지 연산
        int n8 = 10;
        int n9 = 2;
        int n10 = n8 % n9;
        System.out.println(n10);


    }
}
