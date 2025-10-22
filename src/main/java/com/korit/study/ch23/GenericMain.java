package com.korit.study.ch23;

public class GenericMain {

    public static void main(String[] args) {

        NonGeneric a = new NonGeneric("문자열 데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] arr = {a, b, c, d};
        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
        }

    }

}
