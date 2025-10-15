package com.korit.study.ch08;

public class Array02 {
    public static void main(String[] args) {

        String[] 사원ID = new String[] {"E1001", "E1002", "E1003", "E1004"};
        String[] 이름 = new String[] {"김민준", "이서연", "박지훈", "최예나"};
        String[] 부서 = new String[] {"영업팀", "마케팅팀", "개발팀", "인사팀"};
        String[] 직급 = new String[] {"사원", "대리", "과장", "차장"};

        String name = "이서연";

        int foundIndex = -1;

        for (int i = 0; i < 이름.length; i++) {
            if (name.equals(이름[i])) {
                foundIndex = i;
                break;
            }
        }

        printInfo(사원ID, 이름, 부서, 직급, foundIndex);

    }

    public static void printInfo(
            String [] 사원ID,
            String[] 이름,
            String[] 부서,
            String[] 직급,
    int index) {
        System.out.printf("""
                사원ID : %s
                이름 : %s
                부서 : %s
                직급 : %s 
                """ , 사원ID[index],이름[index],부서[index],직급[index]);
    }
}
