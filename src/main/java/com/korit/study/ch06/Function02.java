package com.korit.study.ch06;

public class Function02 {

    /*
         접근제어자  리턴타입  함수이름 (매개변수) {
            return 결과값;
         }

         오버로딩 :
            메소드 이름 동일, 매개변수의 개수나 타입이 달라야함, 리턴 타입만 다르면 오버로딩 X
      */

    public static void main(String[] args) {
        fx1();
        fx2("서민재", 19);
        fx3("서민재", 20);

        int[] arr1 = fx4();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        int[] arr2 = fx5(5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        printIntArray(arr1);
    }

    static void fx1() {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        for (int i = 0; i < 5; i++) {
            result += num1;
            result += num2;
        }
        System.out.println(result);
    }

    static void fx2(String name, int age) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

    static void fx3(String a, int b) {
        System.out.println("이름 : " + a);
        System.out.println("나이 : " + b);
    }

    static int[] fx4() {
        int[] result = new int[0];
        int size = 10;
        for (int i = 0; i < size; i++) {
            int[] temp = new int[result.length + 1];
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1;
            result = temp;
        }
        return result;
    }

    static int[] fx5(int size) {
        int[] result = new int[0];
        for (int i = 0; i < size; i++) {
            int[] temp = new int[result.length + 1];
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1;
            result = temp;
        }
        return result;
    }

    static void printIntArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}
