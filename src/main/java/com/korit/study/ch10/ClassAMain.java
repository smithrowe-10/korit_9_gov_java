package com.korit.study.ch10;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "김준일";
        a.age = 32;

        ClassB b = new ClassB("김준일", 32);
        System.out.println(b.name);
        System.out.println(b.age);

        ClassC c = new ClassC("김준일", 33, "동래구");    // 값 주입 (의존성 주입할때 그 주입)
        ClassC c2 = new ClassC();
    }
}
