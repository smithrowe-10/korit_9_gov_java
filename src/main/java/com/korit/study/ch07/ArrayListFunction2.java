package com.korit.study.ch07;


import java.util.Scanner;

public class ArrayListFunction2 {

    public static int inputNum() {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        int num = 0;

        while (flag) {
            System.out.print("번호를 입력하세요 : ");
            num = scanner.nextInt();

            if ( num > 0 && num < 46 ) {
                flag = false;
            } else {
                System.out.println("유효한 숫자가 아닙니다.");
            }
        }
        return num;
    }

    public static void lottoArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            boolean isDuplicated = false;
            int newNum = inputNum();

            for (int j = 0; j < i; j++) {
                if (array[j] == newNum) {
                    isDuplicated = true;
                    break;
                }
            }

            if (isDuplicated) {
                System.out.println("중복된 번호입니다");
                i--;
            } else {
                array[i] = newNum;
            }
        }
    }


    public static void main(String[] args) {

        int[] lotto = new int[6];

        lottoArray(lotto);
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }

}
