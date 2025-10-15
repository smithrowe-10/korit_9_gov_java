package com.korit.study.ch06;

public class Q3 {
    public static void main(String[] args) {

        double celsius = 32.5;
        checkTemperatureConversion(celsius);

        System.out.println("계산결과 : " + calculate(885, 1414, 326432, 84));
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void checkTemperatureConversion(double celsius) {
        boolean isTrue = false;


        System.out.printf("입력받은 온도 : %f" + System.lineSeparator(), celsius);
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("화씨로 변환한 온도 : %f" + System.lineSeparator(), fahrenheit);
        double celsius2 = fahrenheitToCelsius(fahrenheit);
        System.out.printf("섭씨로 변환한 온도 : %f" + System.lineSeparator(), celsius2);


        isTrue = celsius == celsius2;
        if (isTrue) {
            System.out.println("함수오류없음");
        } else {
            System.out.println("함수오류발견");
        }
    }

    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int subtract(int a, int b) { return a - b; }

    public static int calculate(int a, int b, int c, int d) {
        int n1 = add(a, b);
        int n2 = multiply(n1, c);
        int n3 = subtract(n2 , d);

        return n3;
    }
}
