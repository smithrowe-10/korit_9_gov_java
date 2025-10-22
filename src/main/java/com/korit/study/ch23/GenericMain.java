package com.korit.study.ch23;

import java.util.List;

public class GenericMain {

    public static void main(String[] args) {

        NonGeneric a = new NonGeneric("문자열 데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] arr = {a, b, c, d};
        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
            if (n.getData() instanceof String) {
                String data = (String) n.getData();
                System.out.println(data);
            } else if (n.getData() instanceof NonGeneric data) {
                System.out.println(data);
            }
        }

        Generic<String, Integer> e = new Generic</*여긴 생략 가능*/>("문자열 데이터", "a", 3.5, 2);



    }
}
