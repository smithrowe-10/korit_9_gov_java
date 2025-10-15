package com.korit.study.ch04;

import java.util.Scanner;

public class Controller02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = scanner.nextLine();

        // 자료형은 다 동일해야함
        switch (name) {
            case "김준일":
                System.out.println("1");
                break;  // break 안하면 다 실행됨
            case "김준이": // branch
                System.out.println("2");
                break;
            case "김준삼":
                System.out.println("3");
                break;
            default:
                System.out.println("나머지");
        }
    }
}
