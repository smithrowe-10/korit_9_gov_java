package com.korit.study.ch32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class StudentFileMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();



        try {
            FileReader fileReader = new FileReader("student.txt");
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                char text = (char) readData;
                stringBuilder.append(text);
            }
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("FileReader 객체를 통해 데이터를 읽는데 실패하였습니다.");
        }

        List<String> textList = Arrays.asList(stringBuilder.toString().split("\n"));

        try {
            FileWriter fileWriter = new FileWriter("student.txt");
            for (int i = 0; i < textList.size(); i++) {
                if (textList.get(i).contains("이름")) {
                    textList.set(i, "이름 : 서민재");
                }
               else if (textList.get(i).contains("나이")) {
                    textList.set(i, "나이 : 19");
                }
                fileWriter.write(textList.get(i) + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringBuilder);
        System.out.println(textList);

    }
}
