package com.korit.study.ch18;

public class 컴퓨터 extends 전자기기 {

    public 컴퓨터(int 전압) {
        super(전압);
    }

    @Override
    public void 켠다() {
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void 끈다() {
        System.out.println("컴퓨터를 끕니다.");
    }

    public void 바이오스부팅() {
        System.out.println("바이오스 세팅으로 들어갑니다.");
    }
}