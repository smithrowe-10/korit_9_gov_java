package com.korit.study.ch05;

public class Star {
    public static void main(String[] args) {
//
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();

        int n = 6;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < (i < 2 ? i : i < n - 1 ? 1 : 0); j++) {
//                System.out.print(" ");
//                }

            System.out.print(i == 0 || i == n - 1 ? "" : " ");

            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int rows = 11;

        for (int i = 0; i < rows; i++) {
            if (i <= rows / 2) {
                for (int j = 0; j < rows / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 0; j < i - rows / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
