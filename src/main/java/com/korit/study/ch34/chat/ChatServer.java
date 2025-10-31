package com.korit.study.ch34.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

class Client extends Thread {
    private Socket socket;

    public Client(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String line = in.readLine();
                System.out.println(line);

                for (Client client : ChatServer.clients) {
                    Socket clientSocket = client.socket;
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
                    out.println(line);
                    System.out.println("test!!");
                    out.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

public class ChatServer {
    public static Vector<Client> clients = new Vector<>();

    public static void main(String[] args) {
        final int SERVER_PORT = 5000;

        try {
            ServerSocket server = new ServerSocket(SERVER_PORT);
            while (true) {
                Socket socket = server.accept();
                Client client = new Client(socket);
                client.start();
                clients.add(client);
                System.out.println(socket.getInetAddress());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//192.168.2.101