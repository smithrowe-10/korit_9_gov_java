package com.korit.study.ch31;

/*
    예외처리 (Exception or Error)
    Throwable -> Error(오류), Exception(예외)
    오류(사용자 제어 불가) -> OutOfMemoryError(메모리 공간 부족), StackOverflowError()
    예외(사용자 제어 가능) -> Exception
        1. IOException(checked Exception)
        2. SQLException(checked Exception)
        3. RuntimeException(unchecked Exception)

    Checked Exception -> 컴파일 타임 예외
        1. 컴파일 시점에 확인되는 예외
        2. 반드시 처리해야하는 예외
        3. 파일, 네트워크, 데이터베이스 연결

    UnChecked Exception -> 런타임 예외
        1. 실행 중 발생하는 예외
        2. 처리를 선택적으로 해줄 수 있음
        3. 주소 참조, 실행 도중 자원(쓰레드, 인스턴스)의 부재
        4. RuntimeException을 상속받음


 */

import java.io.IOException;
import java.util.List;

public class ExceptionMain {

    public static void main(String[] args) {

        int count = 0;
        while(true) {
            String name = "김준일";
            if(count == 10) {
                name = null;
            }
            try {
                System.out.println(name.startsWith("김"));
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
            count++;
        }
        System.out.println("프로그램 정상 종료");

        try {
            String[] names = {"김준일", "김준이"};
            for (int i = 0; i < names.length + 1; i++) {
                System.out.println(names[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        try {
            printAll(List.of(10, 20, 30, 40), 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            printAll2(List.of(10, 20, 30, 40), 5);
        } catch (IOException e) {

        }

        try {
            printAll3(List.of(10, 20, 30, 40), 5);
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public static void printAll(List<Integer> nums, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(nums.get(i));
        }
    }

    public static void printAll2(List<Integer> nums, int size) throws IOException{
        for (int i = 0; i < size; i++) {
            System.out.println(nums.get(i));
        }
    }

    public static void printAll3(List<Integer> nums, int size) throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < size; i++) {
            System.out.println(nums.get(i));
        }
    }

}
