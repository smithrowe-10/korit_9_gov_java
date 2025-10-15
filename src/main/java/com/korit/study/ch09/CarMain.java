package com.korit.study.ch09;

public class CarMain {
    public static void main(String[] args) {

        String model1 = "소나타";
        String color1 = "검정색";
        String model2 = "아반떼";
        String color2 = "파랑색";

        Car c1 = new Car();
        c1.model = "소나타";
        c1.color = "검정색";

        Car c2 = new Car();
        c2.model = "아반떼";
        c2.color = "파랑색";

        Car c3 = new Car(); // 인스턴스는 기본값으로 자동 초기화
        System.out.println(c3.model);

    }
}
