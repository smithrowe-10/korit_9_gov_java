package com.korit.study.ch33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstEchoServer {
    public static void main(String[] args) {

        final int PORT = 5000;

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("에코 서버 실행");

            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결");
            System.out.println("IP: " + socket.getInetAddress());
            System.out.println("포트번호: " + socket.getPort());

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            String message = reader.readLine();
            System.out.println("메세지 내용: " + message);

            writer.println("서버 응답 내용: " + message);
            writer.flush();

            reader.close();
            writer.close();
            socket.close();
            serverSocket.close();

            System.out.println("서버 종료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
