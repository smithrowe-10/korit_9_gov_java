package com.korit.study.ch06;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(add(1, 1));
        System.out.println(add(1.1, 1.1));
        System.out.println(add(1, 1, 1));

        printInfo("서민재");
        printInfo("서민재", 19);
        printInfo("서민재", 19, "중앙고");
    }

    // 1

    public static int add (int a, int b) {
        return a + b;
    }

    public static double add (double a, double b) {
        return a + b;
    }

    public static int add (int a, int b, int c) {
        return a + b + c;
    }

    // 2

    public static void printInfo(String name) {
        System.out.println("이름 : " + name);
    }

    public static void printInfo(String name, int age) {
        printInfo(name);
        System.out.println("나이 : " + age);
    }

    public static void printInfo(String name, int age, String school) {
        printInfo(name, age);
        System.out.println("학교 : " + school);
    }

}
