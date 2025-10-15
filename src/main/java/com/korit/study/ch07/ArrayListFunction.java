package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction {

    public static String[] addToArray(String value, String[] currentArray) {
        String[] newArray = new String[currentArray.length + 1];

        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static void printName (String[] names) {
        if (names.length < 1) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + "):" + names[i]);
            }
        }
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름입력 :");
        return scanner.nextLine();
    }

    public static String[] addInputNameToNames(String[] names) {
        String name = inputName();
        return addToArray(name, names);
    }

    public static void main(String[] args) {
        String[] names = new String[0];

        printName(names);
        names = addInputNameToNames(names);
        printName(names);
        names = addInputNameToNames(names);
        printName(names);
        names = addInputNameToNames(names);
        printName(names);
        names = addInputNameToNames(names);
        printName(names);



    }
}
