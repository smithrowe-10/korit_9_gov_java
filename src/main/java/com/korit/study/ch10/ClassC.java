package com.korit.study.ch10;

public class ClassC {
    String name;
    int age;
    String address;

    // 생성자 오버로딩
    ClassC() {

    }

    ClassC(String name) {
        this.name = name;
    }

    ClassC(String name, int age) {
        this.name = name;
        this.age = age;
    }


    ClassC(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}