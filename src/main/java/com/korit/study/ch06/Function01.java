package com.korit.study.ch06;

public class Function01 {
                // 리턴이 없다
    public static void main(String[] args) {
        int result = sum(10, 20, 30, 40);
        System.out.println(result);
    }
    // 리턴 자료형
    static int sum(int a, int b, int c, int d) {
        return sum2(a, b) + sum2(c, d);
    }

    static int sum2(int a, int b) {
        return a + b;
    }
}