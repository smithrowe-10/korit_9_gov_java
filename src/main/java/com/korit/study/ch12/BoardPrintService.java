package com.korit.study.ch12;

import java.util.Base64;

public class BoardPrintService {

    void infoAllBoard(Board[] boards) {
        System.out.println("글 목록");
        for (Board board : boards) {
            System.out.println(board.title);
        }
    }

    void infoBoard(Board board) {
        System.out.println("글 정보");
        System.out.println(board.title);
        System.out.println(board.contents);
        System.out.println("글쓴이 : " + board.writer.name);
        infoComments(board.comments);
    }


    void infoWriter(Writer writer) {
        System.out.println("글쓴 이 정보");
        System.out.println(writer.id);
        System.out.println(writer.name);
    }

    void infoComments(Comment[] comments) {
        for (Comment comment : comments) {
            infoComment(comment);
        }
    }

    void infoComment(Comment comment) {
        System.out.print(comment.contents + "\t");
        System.out.println(comment.writer.name);
    }
}
