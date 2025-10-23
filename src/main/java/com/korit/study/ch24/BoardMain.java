package com.korit.study.ch24;

import java.util.*;

public class BoardMain {

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

        List<Object> allList = new ArrayList<>();

//      ==========================================================================================

        WriterMap writerMap1 = new WriterMap("김준일", 32);
        CommentMap commentMap1 = new CommentMap("김준이", "댓글 내용1");
        CommentMap commentMap2 = new CommentMap("김준삼", "댓글 내용2");

        List<Object> commentList1 = new ArrayList<>(Arrays.asList(commentMap1.put(), commentMap2.put()));

        AllMap allMap1 = new AllMap("게시판 제목1", writerMap1.put(), "게시판 내용1", commentList1);

        allList.add(allMap1.put());

//      ==========================================================================================

        WriterMap writerMap2 = new WriterMap("김준사", 34);
        CommentMap commentMap3 = new CommentMap("김준오", "댓글 내용11");
        CommentMap commentMap4 = new CommentMap("김준육", "댓글 내용22");
        List<Object> commentList2 = new ArrayList<>(Arrays.asList(commentMap3.put(), commentMap4.put()));

        AllMap allMap2 = new AllMap("게시판 제목2", writerMap2.put(), "게시판 내용2", commentList2);

        allList.add(allMap2.put());

//      ==========================================================================================

        System.out.println(allList);
    }

}
