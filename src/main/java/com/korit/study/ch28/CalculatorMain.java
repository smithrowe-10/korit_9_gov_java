package com.korit.study.ch28;

interface Calculator {
int calculate(int a, int b);
}

public class CalculatorMain {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // TODO: 익명 클래스로 덧셈 계산기 구현
        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        }; // 여기에 구현


        // TODO: 익명 클래스로 뺄셈 계산기 구현
        Calculator subtract = (a, b) -> a - b; // 여기에 구현

        // TODO: 익명 클래스로 곱셈 계산기 구현
        Calculator multiply = (a, b) -> a * b; // 여기에 구현

        System.out.println(x + " + " + y + " = " + add.calculate(x, y));
        System.out.println(x + " - " + y + " = " + subtract.calculate(x, y));
        System.out.println(x + " * " + y + " = " + multiply.calculate(x, y));
    }
}
