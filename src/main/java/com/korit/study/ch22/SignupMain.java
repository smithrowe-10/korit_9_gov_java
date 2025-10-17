package com.korit.study.ch22;

import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.service.SignupService;

import java.util.Scanner;

public class SignupMain {
    public static void main(String[] args) {

        SignupService signupService = SignupService.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[회원가입, 로그인]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.print("선택 >> ");

            String selectedMenu = scanner.nextLine();

            if ("q".equals(selectedMenu)) {
                System.out.println("프로그램 종료 중...");
                break;
            } else if ("1".equals(selectedMenu)) {

                System.out.println("[ 회원가입 ]");
                SignupDto signupDto = new SignupDto();

                System.out.print("사용자이름 : ");
                while (true) {
                    signupDto.setUsername(scanner.nextLine() + System.lineSeparator());
                    if (signupService.isValidDuplicatedUsername(signupDto.getUsername())) {
                        break;
                    }
                    System.out.println("이미 사용중인 사용자이름입니다.");
                }
                System.out.print("비밀번호 : ");
                while (true) {
                    signupDto.setPassword(scanner.nextLine() + System.lineSeparator());
                    if (signupService.isValidPassword(signupDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
                }
                System.out.print("비밀번호확인 : ");
                signupDto.setConfirmPassword(scanner.nextLine() + System.lineSeparator());



            } else if ("2".equals(selectedMenu)) {

                System.out.println("[ 로그인 ]");
                System.out.print("사용자이름 : ");
                System.out.print("비밀번호 : ");

            } else if ("3".equals(selectedMenu)) {

                System.out.println("[ 가입된 회원 전체 조회 ]");

            }
        }

        System.out.println("프로그램 종료 완료");

    }
}
