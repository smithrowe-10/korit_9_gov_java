package com.korit.study.ch10;

class ConstructorStudy {
    String data1;   // final이 있다고 가정
    int data2;
    double data3;   // final이 있다고 가정
    // 매개변수인자들 - Arguments

    // 매개변수가 없는 생성자 - NoArgsConstructor ***중요***
    ConstructorStudy() {}

    // 필수값을 모두 받는 생성자 - RequiredArgsConstructor ***중요***
    ConstructorStudy(String data1, double data3) {
        this.data1 = data1;
        this.data3 = data3;
    }

    // 모든 필드(인스턴스 변수)를 매개변수로 받아 생성하는 생성자 - AllArgsConstructor ***중요***
    ConstructorStudy(String data1, int data2,double data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }
}

public class 생성자정리 {
    public static void main(String[] args) {

    }
}
