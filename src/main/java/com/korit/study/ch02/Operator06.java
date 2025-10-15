package com.korit.study.ch02;

public class Operator06 {
    public static void main(String[] args) {

//        // 테스트 데이터
//        int baseSalary = 4000000;    // 기본급
//        int workYears = 12;          // 근무년수
//        int position = 4;            // 직급코드 (1:사원, 2:대리, 3:과장, 4:부장)
//        int overtimeHours = 15;      // 야근시간
//
//        // 테스트 케이스 2 (추가로 테스트해볼 값들)
////         int baseSalary = 3500000, workYears = 18, position = 4, overtimeHours = 8;
////         int baseSalary = 2800000, workYears = 5, position = 2, overtimeHours = 25;
//
//
//        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
//        // 직급수당 계산
//
//        int positionAllowance = position == 1 ? 0 : position == 2 ? 500000 : position == 3 ? 1000000 : position == 4 ? 2000000 : 0;
//
//        // 연차수당 계산 (기본급 기준 %)
//        int yearAllowance = workYears < 3 ? 0 : workYears < 8 ? (baseSalary / 100) * 5 : workYears < 15 ? (baseSalary / 100) * 10 : (baseSalary / 100) * 20;
//
//        // 야근수당 계산
//        int overtimePayment = overtimeHours <= 10 ? (10000 * overtimeHours) : (overtimeHours * 15000);
//
//        // 특별보너스 계산
//        int specialBonus = (workYears > 14 && position == 4) ? 500000 : 0;
//
//        // 총 지급액 계산
//        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;
//
//        // 세금 계산
//        int tax = totalSalary > 5000000 ? (totalSalary/100)*15 : (totalSalary/100)*10;
//
//        // 실수령액 계산
//        int finalSalary = totalSalary - tax;
//
//        // 직급명 출력용
//        String positionName = position == 1 ? "사원" : position == 2 ? "대리" : position == 3 ? "과장" : position == 4 ? "부장" : "X";
//
//        // 결과 출력
//        System.out.println("=== 급여 명세서 ===");
//        System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
//        System.out.println("직급:" + positionName);
//        System.out.println("직급수당:" + positionAllowance);
//        System.out.println("연차수당:" + yearAllowance);
//        System.out.println("야근수당:" + overtimePayment);
//        System.out.println("특별보너스:" + specialBonus);
//        System.out.println("총지급액:" + totalSalary);
//        System.out.println("세금:" + tax);
//        System.out.println("실수령액:" + finalSalary);


        System.out.println(System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() );

        int level = 75;
        int jobCode = 1;        // 1:전사, 2:마법사, 3:궁수, 4:도적
        int equipGrade = 4;     // 1-5등급
        int skillPoints = 95;
        // 테스트 케이스 2 (추가 테스트)
        // int level = 63, jobCode = 2, equipGrade = 5, skillPoints = 120;
        // int level = 42, jobCode = 4, equipGrade = 2, skillPoints = 60;

        // 직업별 계수 계산 (삼항 연산자 사용)
        double jobMultiplier = jobCode == 1 ? 1.5 :
                jobCode == 2 ? 1.2 :
                jobCode == 3 ? 1.3 :
                jobCode == 4 ? 1.1 : 0;

        // 기본 능력치 계산
        int baseStats = (int)(level * jobMultiplier);

        // 장비 보정 계산 (%)
        int equipBonus = (int)(equipGrade == 1 ? baseStats * 0 :
                equipGrade == 2 ? baseStats * 0.1 :
                equipGrade == 3 ? baseStats * 0.25 :
                equipGrade == 4 ? baseStats * 0.50 :
                equipGrade == 5 ? baseStats * 1 : -1);

        // 스킬 보너스 계산 (최대 50%)
        double skillBonus = (skillPoints > 100) ? 0.5 : 0.05*(skillPoints/10);
        int sB = (int)(skillBonus*100);

        // 직업 특성 보너스 계산
        double jobSpecialBonus = (jobCode == 1 && level >= 50) ? 0.2 : (jobCode == 2 && skillPoints >= 80) ? 0.3 : (jobCode == 3 && equipGrade > 3) ? 0.25 : (jobCode == 4 && level%2 != 0) ? 0.15 : 0;


        // 최종 능력치 계산
        int finalStats = (int)(baseStats + baseStats*equipBonus + baseStats*skillBonus + baseStats*jobSpecialBonus);

        // 전투력 등급 계산
        String combatRank = finalStats > 7999 ? "S" : finalStats < 8000 && finalStats > 5999 ? "A" : finalStats < 6000 && finalStats > 3999 ? "B" :  finalStats < 4000 && finalStats > 1999 ? "C" : finalStats < 2000 ? "D" : "X";

        // 직업명 계산
        String jobName = jobCode == 1 ? "전사" : jobCode == 2 ? "마법사" : jobCode == 3 ? "궁수" : jobCode == 4 ? "도적" : "X";

        // 결과 출력
        System.out.println("=== 캐릭터 스탯 ===");

        // 출력 구현

    }
}
