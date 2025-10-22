package com.korit.study.ch23;

import java.util.ArrayList;

public class CollectionMain {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();   // Object가 생략되어있음
        list.add(10);
        list.add("20");
        list.add(30.5);
        list.add(true);
        System.out.println(list);
        System.out.println(list.get(0));    // 꺼내면 Object로 나옴 그래서 다운캐스팅이 필요
        ArrayList<String> strList = new ArrayList<>();
        strList.add("문자열");
        System.out.println(strList.get(0));

        test(new ArrayList<>());
    }

    public static void test(ArrayList<String> strList) {

    }

}
