package com.korit.study.ch02;

public class GameCharacterCalculator {
    public static void main(String[] args) {

        int level = 75;
        int jobCode = 1;
        int equipGrade = 4;
        int skillPoints = 95;

        // 직업별 계수 계산 (삼항 연산자 사용)
        double jobMultiplier =
                jobCode == 1 ? 1.5 :
                jobCode == 2 ? 1.2 :
                jobCode == 3 ? 1.3 :
                jobCode == 4 ? 1.1 : 0;

        // 기본 능력치 계산
        int baseStats = (int)(level * jobMultiplier);

        // 장비 보정 계산 (%)
        double equipRate =
                (equipGrade == 1 ? 0 :
                equipGrade == 2 ? 0.1 :
                equipGrade == 3 ? 0.25 :
                equipGrade == 4 ? 0.50 :
                equipGrade == 5 ? 1 : -1);

        int equipBonus = (int)(baseStats*equipRate);
        System.out.println(equipBonus);

        // 스킬 보너스 계산 (최대 50%)
        double skillRate = (skillPoints > 100) ? 0.5 : (skillPoints/10) * 0.05;
        int skillBonus = (int)(baseStats * skillRate);

        // 직업 특성 보너스 계산
        double jobSpecialRate =
                (jobCode == 1 && level >= 50) ? 0.2 :
                (jobCode == 2 && skillPoints > 79) ? 0.3 :
                (jobCode == 3 && equipGrade > 3) ? 0.25 :
                (jobCode == 4 && level%2 != 0) ? 0.15 : -1;

        int jobSpecialBonus = (int)(baseStats * jobSpecialRate);

        // 최종 능력치 계산
        int finalStats = (int)(baseStats + baseStats*equipBonus + baseStats*skillBonus + baseStats*jobSpecialBonus);

        // 전투력 등급 계산
        String combatRank =
                finalStats <= 2000 ? "D" :
                finalStats > 2000 ? "C" :
                finalStats > 4000 ? "B" :
                finalStats > 6000 ? "A" :
                finalStats > 8000 ? "S" : null;

        // 직업명 계산
        String jobName =
                jobCode == 1 ? "전사" :
                jobCode == 2 ? "마법사" :
                jobCode == 3 ? "궁수" :
                jobCode == 4 ? "도적" : null;

        // 결과 출력
        System.out.println("=== 캐릭터 스탯 ===");
        // 출력 구현

    }
}
