package com.korit.study.ch04;

import java.util.Scanner;

public class Controller03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        boolean isOpen = true;
//
//        while (isOpen) {
//            System.out.println("문을 열고 들어왔습니다.");
//            System.out.print("문을 닫으시겠습니까?(y/n)");
//            String cmd = scanner.nextLine();
//            isOpen = !"y".equals(cmd);
//            System.out.println("a");
//        }
//        System.out.println("문을 닫고 나갔습니다.");
//
//        while (true) {
//            System.out.println("문을 열고 들어왔습니다.");
//            System.out.print("문을 닫으시겠습니까?(y/n)");
//            String cmd = scanner.nextLine();
//            if("y".equals(cmd)) {
//                break;
//            }
//            System.out.println("a");
//        }

        while (true) {
            System.out.println("첫번째 반복 y/n: ");
            String cmd = scanner.nextLine();
            if ("y".equals(cmd)) {
                while (true) {
                    System.out.println("두번째 반복 y/n:");  // 디렉토리 구조 뒤로가기 느낌s
                    String cmd2 = scanner.nextLine();
                    if ("n".equals(cmd2)) {
                        break;
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
        }

    }
}
