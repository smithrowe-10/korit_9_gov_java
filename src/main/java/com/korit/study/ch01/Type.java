package com.korit.study.ch01;

import java.util.Date;

/**
 *
 */
public class Type {
    /**
     * @apiNote
     * @param args
     */
    public static void main(String[] args) {
//      논리 자료형
        boolean open;   // 선언
        open = true;    // 초기화 : 램의 과거 데이터를 삭제
//      boolean open = true;  <= 선언 및 초기화

//      문자 자료형
        System.out.println(open);
        open = false;   // 대입
        System.out.println(open);

        char lastName = '서';
        System.out.println(System.lineSeparator() + lastName);
//        char firstName = '민재'; <= 두글자는 X

//      문자열 자료형
        String firstName = "민재";
        System.out.println(firstName + System.lineSeparator());
        String contents1 = "안녕하세요. \n서민재입니다.";
        System.out.println(contents1);
        System.out.println();
        String contents2 = """
                안녕하세요
                서민재입니다.""";
        System.out.println(contents2);
        System.out.println();
        String contents3 = "안녕하세요" + System.lineSeparator() + "서민재입니다.";
        System.out.println(contents3);
        System.out.println();

//      숫자
        double avg = 89.33;
        System.out.println(avg);
        int number = 10000000;
        System.out.println(number);
        int nowTime = (int) new Date().getTime();
        System.out.println(nowTime);
        long longNumber = 2200000000l;
        System.out.println(longNumber);

//      상수
        String uploadPath = "-/upload/image";
        final String UPLOAD_PATH = "-/upload/image";
//      String UPLOAD_PATH = "-/upload/image/image";   <= 못바꿈 (대입 불가)


        /* 이건 ctrl + shift + / 임 */
        /**
         * 이건
         * /**
         * +
         * enter
         */

    }
}
