package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class BoardMain2 {

    // 게시판
    /**
     * [
     *      {
     *          "title": "게시판 제목1",
     *          "writer": {
     *              "name": "김준일",
     *              "age": 32
     *          },
     *          "content": "게시판 내용1",
     *          "comments": [
     *              {
     *                  "writer": "김준이",
     *                  "content": "댓글 내용1"
     *              },
     *              {
     *                  "writer": "김준삼",
     *                  "content": "댓글 내용2"
     *              },
     *          ]
     *      },
     *      {
     *          "title": "게시판 제목2",
     *          "writer": {
     *              "name": "김준사",
     *              "age": 34
     *          },
     *          "content": "게시판 내용2",
     *          "comments": [
     *              {
     *                  "writer": "김준오",
     *                  "content": "댓글 내용11"
     *              },
     *              {
     *                  "writer": "김준육",
     *                  "content": "댓글 내용22"
     *              },
     *          ]
     *      },
     * ]
     */

    public static void main(String[] args) {

        List<Board> boards = new ArrayList<>();

        boards.add(new Board());
        boards.get(0).setTitle("게시판 제목1");
        boards.get(0).setWriter(new Writer("김준일", 32));
        boards.get(0).setContent("게시판 내용1");
        boards.get(0).setComments(new ArrayList<>());
        boards.get(0).getComments().add(new Comment(new Writer("김준이", 31), "댓글 내용1"));
        boards.get(0).getComments().add(new Comment(new Writer("김준삼", 31), "댓글 내용2"));

        Board board = new Board();
        board.setTitle("게시판 제목2");
        board.setContent("게시판 내용2");
        board.setWriter(new Writer("김준사", 34));

        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(new Writer("김준오", 35), "댓글 내용11"));
        comments.add(new Comment(new Writer("김준육", 36), "댓글 내용22"));
        board.setComments(comments);
        boards.add(board);

/// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment(new Writer("김준오", 35), "댓글 내용11"));
        comments2.add(new Comment(new Writer("김준육", 36), "댓글 내용22"));

        Board board2 = new Board("게시판 제목2", new Writer("김준사", 34), "게시판 내용2", comments2);
        boards.add(board2);

        System.out.println(boards);


    }

}
