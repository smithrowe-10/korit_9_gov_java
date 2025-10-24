package com.korit.study.ch25;

import com.korit.study.ch24.Board;
import com.korit.study.ch24.Comment;
import com.korit.study.ch24.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 불변 컬렉션
public class ImmutableCollection {

    public static void main(String[] args) {

        List<String> iList = List.of("김준일","김준이","김준삼","김준사");
        System.out.println(iList);

        Map<String, List<String>> iMap = Map.of(
                "k1", List.of("김준일", "김준이"),
                "k2", List.of("김준삼", "김준사"),
                "k3", List.of("김준오", "김준육"),
                "k4", List.of("김준칠", "김준팔", "김준구")
        );
        List<Board> boards = new ArrayList<>();
        boards.add(new Board(
                "제목1",
                new Writer("김준일", 32),
                "내용1",
                List.of(
                        new Comment(new Writer("김준이", 32), "댓글1"),
                        new Comment(new Writer("김준삼", 33), "댓글2")
                )));

        System.out.println(iMap);
        System.out.println(boards);
    }

}
