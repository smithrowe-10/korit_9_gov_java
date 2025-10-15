package com.korit.study.ch02;

public class Operator04 {
    /**
     * 산술, 논리, 비교, 부호, 관계, 증감, 조건, 복합 대입 연산자에 대해 학습
     */
    public static void main(String[] args) {

//      관계연산자
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b;
        boolean h = a != b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println();
        System.out.println();

        int n = 10;
        boolean r = 4 < n && n < 16;  // 5 - 15 사이면 r의 값이 true
        System.out.println(r);

        a = 10;
        b = 10;
        System.out.println(a == b);
        System.out.println("a" == "a"); // 같고 틀린건 비교 ㄱㄴ
        System.out.println("a".equals("a"));    // 근데 이래해야대긴 함;
        System.out.println('a' == 'a');
        System.out.println(true == true);
        System.out.println(false == false);
        System.out.println();

        int 키 = 170;
        int 몸무게 = 65;
        double Height = (키/100.0)*(키/100.0); //혹은 키에 double을 붙인다. (나누기보다 캐스팅연산이 먼저일어남)

        double BMI = 몸무게/Height;  // 키에서 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과
        boolean 저체중 = BMI < 18.5; //18.5미만
        boolean 정상 = BMI >= 18.5 && BMI < 25;  //18.5에서 24.9사이
        boolean 과체중 = BMI >= 25 && BMI < 30; //25에서 29.9사이
        boolean 비만 = BMI >= 30;  //30이상
//      무조건 변수가 왼쪽!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        System.out.println(BMI);
        System.out.println("저체중 : " + 저체중);
        System.out.println("정상 : " + 정상);
        System.out.println("과체중 : " + 과체중);
        System.out.println("비만 : " + 비만);

//      급여계산(근로기준법 총근로시간 40시간, 나머지는 시간외 근무시간)

        System.out.println(System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator());

        int 기본급 = 2400000 ;
        int 근무시간 = 52 * 4;
        int 근로기준법근무시간 = 40 * 4;
        int 시급 = 기본급/(근로기준법근무시간);
        int 시간외수당 = (근무시간 - 근로기준법근무시간)*(int)(시급 * 1.5);
        int 총급여 = 기본급 + 시간외수당; // 기본급 + (시간외 수당 * 1.5)
        int 세금 = (총급여/100)*10; // 총급여의 10%
        int 지급급여 = 총급여 - 세금; // 총급여 - 세금
        System.out.println(시급);
        System.out.println("총급여 : " + 총급여);
        System.out.println("세금 : " + 세금);
        System.out.println("지급급여 : " + 지급급여);

    }
}