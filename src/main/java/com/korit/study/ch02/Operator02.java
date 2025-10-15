package com.korit.study.ch02;

public class Operator02 {
    /**
     * 산술, 논리, 비교, 부호, 관계, 증감, 조건, 복합 대입 연산자에 대해 학습
     */
    public static void main(String[] args) {

        int i = 0;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1; // i = i + 1;
        System.out.println(i);
        ++i;    // i += 1;
        System.out.println(i);
        i++;
        System.out.println(i + System.lineSeparator());

        System.out.println(++i);    //  선증가 : 명령이 끝나기 전에 더함
        System.out.println(i++ + 10);    //  후증가 : 명령이 끝난 후에 더함
        System.out.println(i);


    }
}
