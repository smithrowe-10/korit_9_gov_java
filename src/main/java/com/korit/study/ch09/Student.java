package com.korit.study.ch09;

public class Student {

    String name;
    int age;
    boolean sex;

    void printInfo() {

        System.out.println("학생 정보 출력");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + (sex ? "남" : "여"));
        System.out.println();

    }
}
