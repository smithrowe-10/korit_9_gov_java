package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age = 0;
        int grade = 0;
        double korScore = 0;
        double engScore = 0;
        double mathScore = 0;
        String intro;

        System.out.print("학생 이름을 입력하세요 : ");
        name = scanner.next();
        System.out.print("나이를 입력하세요 : ");
        age = scanner.nextInt();
        System.out.print("학년를 입력하세요 : ");
        grade = scanner.nextInt();
        System.out.print("국어 점수를 입력하세요 : ");
        korScore = scanner.nextDouble();
        System.out.print("영어 점수를 입력하세요 : ");
        engScore = scanner.nextDouble();
        System.out.print("수학 점수를 입력하세요 : ");
        mathScore = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("자기소개를 입력하세요 : ");
        intro = scanner.nextLine();

        double avgScore = (korScore + engScore + mathScore)/3;

        String school =
                age > 15 ? "고등학교" :
                age > 12 ? "중학교" :
                age > 6 ? "초등학교" : "미취학아동";

        String unit =
                avgScore >= 95 ? "A+":
                avgScore >= 90 ? "A" :
                avgScore >= 85 ? "B+":
                avgScore >= 80 ? "B" :
                avgScore >= 75 ? "C+":
                avgScore >= 70 ? "C" :
                avgScore >= 65 ? "D+":
                avgScore >= 60 ? "D" : "F";

            System.out.println("=== 학생 정보 ===");
            System.out.println("이름 : " + name);
            System.out.printf("나이 : %d (%s %d학년)" + System.lineSeparator(), age, school, grade);
            System.out.println("성적 : ");
            System.out.printf("\t국어 : %.1f점 " + System.lineSeparator(), korScore);
            System.out.printf("\t영어 : %.1f점 " + System.lineSeparator(), engScore);
            System.out.printf("\t수학 : %.1f점 " + System.lineSeparator(), mathScore);
            System.out.printf("\t평균 : %.1f점 (학점 : %s)" + System.lineSeparator(), avgScore, unit);
            System.out.println("자기소개 : " + intro);

            scanner.close();
    }
}
