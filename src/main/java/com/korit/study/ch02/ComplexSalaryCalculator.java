package com.korit.study.ch02;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {

        // 테스트 데이터
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;

        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
        // 직급수당 계산
        int positionAllowance = position == 1 ? 0 :
                position == 2 ? 500000 :
                position == 3 ? 1000000 :
                position == 4 ? 2000000 : -1;   // 보통 오류를 표현하기위해서 -1을 쓴다

        double yearRate = workYears < 3 ? 0 : workYears < 7 ? 0.05 :
                workYears < 15 ? 0.1 : 0.2;

        // 연차수당 계산 (기본급 기준 %)
        int yearAllowance = (int) (baseSalary * yearRate);

        // 야근수당 계산
        boolean isOver = overtimeHours - 10 > 0;
        int baseOvertime = overtimeHours - 10 > 0 ? 10 : overtimeHours;
        int overTime = overtimeHours - 10 > 0 ? overtimeHours - 10 : 0;
        int overtimePayment = isOver ? ((overtimeHours - 10) * 15000) + (10 * 10000) :
                overtimeHours * 10000;

        // 특별보너스 계산
        int specialBonus = (workYears > 14 && position == 4) ? 500000 : 0;

        // 총 지급액 계산
        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;

        // 세금 계산
        double taxRate = totalSalary > 5000000 ? 0.15 : 0.10;
        int tax = (int)(totalSalary * taxRate);

        // 실수령액 계산
        int finalSalary = totalSalary - tax;

        // 직급명 출력용
        String positionName =
                position == 1 ? "사원" :
                position == 2 ? "대리" :
                position == 3 ? "과장" :
                position == 4 ? "부장" : null;

        // 결과 출력
        System.out.println("=== 급여 명세서 ===");
        System.out.println("기본급\t: " + String.format("%,d", baseSalary) + "원");
        System.out.println("직급 \t: " + positionName);
        System.out.println("직급수당\t: " + String.format("%,d", positionAllowance) + "원");
        System.out.println("연차수당\t: " + String.format("%,d원 (%d", yearAllowance, workYears) + "%)");
        System.out.println("야근수당\t: " + String.format("%,d원 (기본 %d시간 + 초과 %d시간)", overtimePayment, baseOvertime, overTime));
        System.out.println("특별보너스: " + String.format("%,d", specialBonus) + "원");
        System.out.println("총지급액\t: " + String.format("%,d", totalSalary) + "원");
        System.out.printf("세금(%d%%): %,d원\n", (int)(taxRate*100), tax);
        System.out.println("실수령액\t: " + String.format("%,d", finalSalary) + "원");

    }
}
