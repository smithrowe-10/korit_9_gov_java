package com.korit.study.ch02;

public class Operator03 {
    /**
     * 산술, 논리, 비교, 부호, 관계, 증감, 조건, 복합 대입 연산자에 대해 학습
     */
    public static void main(String[] args) {

//      논리연산자
        boolean b1 = false;
        boolean b2 = false;
//      or연산자 (합)
        boolean b3 = b1 || b2;
        System.out.println(b3);
        b3 = b1 || true;
        System.out.println(b3);
//      and연산자 (곱)
        boolean b4 = b1 && b2;
        System.out.println(b4);
        b4 = b1 && true;
        System.out.println(b4);
        b4 = true && true;
        System.out.println(b4);

//      ! not 연산자 (부정)
        boolean b5 = b1 && true;
        b5 = !b5;
        System.out.println(b5);
        System.out.println(!(true && true));

    }
}
