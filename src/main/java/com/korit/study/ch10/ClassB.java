package com.korit.study.ch10;

public class ClassB {
    String name;
    int age;

    ClassB(String name, int age) {
        this.name = name;   // this : 자기 자신의 주소를 의미
        this.age = age;
    }
}
