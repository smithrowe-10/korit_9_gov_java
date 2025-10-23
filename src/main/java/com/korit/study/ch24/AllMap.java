package com.korit.study.ch24;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllMap {

    String title;
    String content;
    Object writer;
    List<Object> comments;

    public AllMap(String title, Object writer,String content, List<Object> comments) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.comments = comments;
    }

    public Object put() {
        Map<String, Object> allMap = new HashMap<>();

        allMap.put("title", title);
        allMap.put("writer", writer);
        allMap.put("content", content);
        allMap.put("comments", comments);

        return allMap;

    }
}
