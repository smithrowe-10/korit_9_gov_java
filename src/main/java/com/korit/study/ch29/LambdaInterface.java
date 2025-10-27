package com.korit.study.ch29;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 인터페이스");
            }
        };

        runnable.run();

        Runnable runnable2 = () -> System.out.println("runnable 인터페이스");

        runnable2.run();

        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer 인터페이스");
                System.out.println("매개변수 s: " + s);
            }
        };

        stringConsumer.accept("consumer");

        Consumer<String> stringConsumer2 = s -> {
            System.out.println("consumer 인터페이스");
            System.out.println("매개변수 s: " + s);
        };

        stringConsumer2.accept("consumer");

        Consumer<Integer> andThenStudy = num -> {
            System.out.println("1");
            System.out.println(num);
        };
        Consumer<Integer> andThenStudy2 = andThenStudy.andThen(num2 -> {
            System.out.println("2");
            System.out.println(num2);
        });

        andThenStudy.accept(10);
        andThenStudy2.accept(20);

        Consumer<Double> doubleConsumer = d -> {
            System.out.println("1");
            System.out.println("숫자: " + d);
        };
        doubleConsumer.andThen(d -> {
            System.out.println("2");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("3");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("4");
            System.out.println("숫자: " + d);
        }).accept(3.14);    // 하나의 엑셉트 값을 가지고 쓰고싶어서 ex) 3에서 3을 더하고 빼고 곱하고 나누고

        // 3. 매개변수 x, 리턴 o
        String str = null;
        Supplier<Boolean> booleanSupplier = () -> Objects.isNull(str);
        System.out.println(booleanSupplier.get());

        // 4. 매개변수 o, 리턴 o
        Function<Integer, String> function = num -> {
            System.out.println("정수 받아서 문자열정수로 리턴");
            return Integer.toString(num);
        };

        String functionResult = function.apply(10);
        System.out.println(functionResult);

        Integer functionResult2 = function.andThen(s -> {
            System.out.println("문자열정수 받아서 실수자료형으로 리턴");
            return Double.parseDouble(s);
        }).andThen(d -> {
            System.out.println("실수자료형 받아서 정수로 리턴");
            return d.intValue();
        }).apply(20);

        System.out.println(functionResult2);


        String functionResult3 = function
                .compose(d -> {
                    System.out.println("실수자료형을 정수로 리턴");
                    return ((Double) d).intValue();
                })
                .apply(20.5);

        System.out.println(functionResult3);



    }

}
