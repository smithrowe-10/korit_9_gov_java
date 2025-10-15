package com.korit.study.ch09;

import java.security.PublicKey;

public class StudentMain {
    public static void main(String[] args) {

        // 2명의 학생정보를 개체를 사용하여 정의하고 출력하는 프로그램을 작성하시오.
        /*
            이름 : 김준일
            나이 : 32
            성별 : 남(true)

            이름 : 김준이
            나이 : 33
            성별 : 여(false)

         */

        Student student1 = new Student();

        student1.name = "김준일";
        student1.age = 32;
        student1.sex = true;

        Student student2 = new Student();

        student2.name = "김준이";
        student2.age = 33;
        student2.sex = false;

        student1.printInfo();
        student2.printInfo();

    }

}
