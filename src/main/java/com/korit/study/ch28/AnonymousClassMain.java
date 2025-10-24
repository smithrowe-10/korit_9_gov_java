package com.korit.study.ch28;

import java.util.concurrent.atomic.AtomicInteger;

public class AnonymousClassMain {

    public static void main(String[] args) {

        AnonymousClass a = new AnonymousClassImpl();
        a.fx1();
        System.out.println(a.fx2());

        int num = 10;
        AtomicInteger num2 = new AtomicInteger(10);

        AnonymousClass b = new AnonymousClass() {
            @Override
            public void fx1() {
                System.out.println(num);
                num2.set(num2.get() + 10);
            }

            @Override
            public int fx2() {
                return 0;
            }
        };

    }

}
