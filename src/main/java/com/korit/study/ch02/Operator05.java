package com.korit.study.ch02;

public class Operator05 {
    public static void main(String[] args) {

        String r = 10 > 0 ? "0보다커" : "0보다작아";   // 결과값의 자료형에 맞춰야함
        double r2 = 10 > 0 ? 1.1 : 2.2 ;
        char r3 = 10 > 0 ? 'o' : 'x' ;
        String r4 = -10 > 0 ? "0보다커" : -10 > -20 ? "-20보다커" : "-20보다작아";    //조건의조건의조건의조건의조건의조건의조건
        String r5 = 2002 % 100 == 0 ? "100의 배수" : "100의 배수 아님";

        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        System.out.println(System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() );

        int year = 2024; // 2024년
        //윤년인지 확인하세요, 4의 배수이면서 100의 배수가 아니거나 또는 400의 배수이면 윤년

//      String result = year % 4 == 0 && year % 100 != 0 ? "윤년입니다." : year % 400 == 0 ? "윤년입니다." : "평년입니다.";
        String result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "윤년입니다." : "평년입니다.";
        System.out.println(result); // 윤년입니다. / 평년입니다.

        System.out.println(System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() );

        int 현재잔액 = 150000;
        int 출금금액 = 160000;
        boolean 출금불가능 = 현재잔액 - (출금금액 + 1000) < 0;
        boolean 출금가능 = 현재잔액 > 출금금액;

        String 상태 = 출금가능 ? "성공" : "실패";
        int 출금액 = 출금가능 ? 출금금액 + 1000 : 0;
        int 거래후잔액 = 출금가능 ? 현재잔액 - (출금금액 + 1000) : 현재잔액;

        System.out.println("거래상태: " + 상태);
        System.out.println("출금액: " + 출금액 + "원(수수료 1000원 포함)");
        System.out.println("거래 후 잔액: " + 거래후잔액 + "원");
    }
}
