package com.korit.study.ch24;

import java.util.HashMap;
import java.util.Map;

public class CommentMap {

    String name;
    String content;

    public CommentMap(String name, String  content) {
        this.name = name;
        this.content = content;
    }

    public Object put() {
        Map<String, Object> writerMap = new HashMap<>();
        writerMap.put("writer", name);
        writerMap.put("content", content);

        return writerMap;
    }



}
