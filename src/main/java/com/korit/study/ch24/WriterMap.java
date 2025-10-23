package com.korit.study.ch24;

import java.util.HashMap;
import java.util.Map;

public class WriterMap{

    String name;
    int age;

    public WriterMap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object put() {
        Map<String, Object> writerMap = new HashMap<>();
        writerMap.put("name", name);
        writerMap.put("age", age);

        return writerMap;
    }

}
