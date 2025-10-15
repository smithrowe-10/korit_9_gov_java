package com.korit.study.ch06;

public class GradeSystem {
    public static void main(String[] args) {
        printStudentInfo("홍길동", 80, 85, 90);
        printStudentInfo("김철수", 95, 92);
    }

    public static double average(int score1, int score2) {
        return (score1 + score2) / 2.0;
    }

    public static double average(int score1, int score2, int score3) {
        return (score1 + score2 + score3) / 3.0;
    }

    public static char getGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printStudentInfo(String name, int score1, int score2, int score3) {
        double avg = average(score1, score2, score3);
        char grade = getGrade(avg);
        System.out.printf("%s 학생의 평균 : %.1f, 등급 %c" + System.lineSeparator() ,name, avg, grade);
    }

    public static void printStudentInfo(String name, int score1, int score2) {
        double avg = average(score1, score2);
        char grade = getGrade(avg);
        System.out.printf("%s 학생의 평균 : %.1f, 등급 %c" + System.lineSeparator() ,name, avg, grade);
    }

}
