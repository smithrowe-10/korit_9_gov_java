package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner s = new Scanner(inputStream);

        String str = s.nextLine();  // 버퍼에 있는것을 출력하는게 먼저 , 버퍼에 아무것도없어야 입력받음.
        // next 와 nextLine의 차이 next는 스페이스앞까지 짜름 nextLine은 스페이스, 줄바꿈 다 포함하고 Enter 앞까지 짜름.
        System.out.printf("입력값: %s" + System.lineSeparator(), str);

//        next뒤에는 버퍼에 엔터가 남아서 이걸로 엔터 빼줘야댐 ㅅㅂ;
//        s.nextLine();

        String address = s.nextLine();
        System.out.printf("주소: %s" + System.lineSeparator(), address);
        System.out.println(s.next());

    }
}
