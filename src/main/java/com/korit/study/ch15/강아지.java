package com.korit.study.ch15;

public class 강아지 extends 동물{

    강아지() {}

    강아지(String 이름) {
        super(이름);  // 동물로 호출
        System.out.println("강아지 생성자 : " + 이름); // 출력 2
    }
}
