package com.korit.study.ch04;

import java.sql.ResultSet;
import java.util.Scanner;

public class Controller06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        // 중첩 반복
//        for (int i = 0; i < 5; i++){
//            System.out.printf("i = %d" + System.lineSeparator(), i);
//            for (int j = 0; j < i; j++) {
//                System.out.printf("j = %d" + System.lineSeparator(), j);
//            }
//        }

//        System.out.print("숫자를 입력하세요 : ");
//        int startDan = scanner.nextInt();
//        System.out.print("숫자를 입력하세요 : ");
//        int endDan = scanner.nextInt();
//
//        int danRange = endDan - startDan + 1;
//
//        for (int i = 0; i < danRange; i++) {
//            int num1 = (startDan + i);
//            System.out.printf("%d단" + System.lineSeparator(), num1);
//            for (int j = 0; j < 9; j++) {
//                int num2 = j + 1;
//                int result = num1*num2;
//                System.out.printf("%d x %d = %d"+ System.lineSeparator(), num1, num2, result );
//            }
//        }
//
//        scanner.close();
//
//        System.out.print("숫자를 입력하세요 : ");
//        int startDan = scanner.nextInt();
//        System.out.print("숫자를 입력하세요 : ");
//        int endDan = scanner.nextInt();
//
//        int danRange = endDan - startDan + 1 ;
//
//        for (int i = 0; i < danRange; i++) {
//            int num1 = (endDan - i);
//            System.out.printf("%d단" + System.lineSeparator(), num1);
//            for (int j = 0; j < 9; j++) {
//                int num2 = 9 - j;
//                int result = num1*num2;
//                System.out.printf("%d x %d = %d"+ System.lineSeparator(), num1, num2, result );
//            }
//        }

        scanner.close();

    }
}
