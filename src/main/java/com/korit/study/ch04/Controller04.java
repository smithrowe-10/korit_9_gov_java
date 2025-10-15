package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {

//              for (초기문(순서1); 조건문(2); 후처리문(4);) {
//                  i (index)(3)
//            }

//      int i = 0;  <= 전역변수 (전역변수로 쓰고있으면 지역변수로 선언할수없다)

//        for (int i = 3; i < 100; i++) {   // 여기 i 는지역변수
//            if (i%4 == 0) {
//                System.out.println(i);
//            }
////            String a;   // 밑의 while 에도 선언 ㄱㄴ 왜냐면 둘다 지역변수니까.
//        }
//      System.out.println(a); 출력은 안댐 왜냐면 지역변수는 지역안에서만 사용가능하니까.


// ===========================================================================================================================================================================

//        int i = 0;
//        while (i < 5) {
//            String a;
//            System.out.println("반복횟수:" + i);
//            i++;
//        }

        for (int i = 0; i < 20; i++) {

            int num = i + 1;

            if (num%2 == 1){
                System.out.println(num + " = 홀");
            } else {
                System.out.println(num + " = 짝");
            }

//            System.out.printf("%,d = %s\n", num, num % 2 == 0 ? "짝" : "홀");

//            if(num % 2 == 0) {
//                System.out.println(num + " = 짝");
//                continue; 다음 코드실행 안하고 건너뛰기
//            }
//            System.out.println(num + " = 홀");

        }

    }
}
