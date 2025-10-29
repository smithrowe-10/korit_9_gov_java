package com.korit.study.ch32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class StudentFileMain2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        final String FILE_NAME = "student.txt";

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                builder.append((char) readData);
            }
            System.out.println(builder);
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("파일 못 찾앗어요");
        } catch (IOException e) {
            System.out.println("파일 내부의 내용을 읽지 모담");
        }

        Map<String, String> modifyDataMap = Map.of(
                "이름", "서민재",
                "나이", "19"
        );

        List<String> readLineList = new ArrayList<>();
        readLineList.addAll(Arrays.asList(builder.toString().split("\n")));

        readLineList.stream().map(line -> {
            AtomicReference<String> stringAtomicReference = new AtomicReference<>(line);
            modifyDataMap.entrySet().forEach(entry -> {
                if (stringAtomicReference.get().contains(entry.getKey())) {
                    stringAtomicReference.set(
                            String.format("%s: %s", entry.getKey(), entry.getValue())
                    );
                }
            });
            return stringAtomicReference.get();
        }).toList().forEach(System.out::println);


    }
}
