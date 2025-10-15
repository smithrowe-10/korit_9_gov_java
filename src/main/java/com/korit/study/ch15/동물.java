package com.korit.study.ch15;

public class 동물 {
    String 이름;

    동물() {}

    public 동물(String 이름) {
        this.이름 = 이름;  // 호출 받고
        System.out.println("동물 생성자 : " + 이름); // 출력 1
    }

    void 먹다() {
        System.out.println(이름 + "이(가) 밥을 먹는다.");
    }
}
