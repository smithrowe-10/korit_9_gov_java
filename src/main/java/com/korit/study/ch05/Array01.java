package com.korit.study.ch05;

public class Array01 {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int [] nums1 = { 1, 2, 3 }; // 한 변수에는 하나의 값만 들어간다 즉 { 1, 2, 3 }은 한 묶음, int [] 까지가 자료형
        int [] nums2 = new int[] {1, 2, 3, 0, 0};

        int [] nums3 = new int[3];
        nums3[0] = 1;
        nums3[1] = 2;
        nums3[2] = 3;

        System.out.println(new int[] {1, 2, 3}[0]);

        for (int i = 0; i < 3; i++) {
            System.out.println(nums1[i]);
        }

        String[] names = {"김준일", "김준이", "김준삼"};
        for (int i = 0; i < 3; i++) {
            System.out.printf("이름 : %s" + System.lineSeparator(), names[i]);
        }

//        forEach
        for (int i : nums1) {
            System.out.print(i);
        }
        for (int i : new int[] {1,2,3,4}) {
            System.out.print(i);
        }
    }
}