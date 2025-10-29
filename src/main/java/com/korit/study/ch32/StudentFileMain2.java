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
        final String FILE_NAME = "student.txt";

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            StringBuilder builder = new StringBuilder();
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                builder.append((char) readData);
            }
            fileReader.close();

            FileWriter fileWriter = new FileWriter(FILE_NAME);

            Map<String, String> modifyDataMap = Map.of(
                    "나이", "34",
                    "이름", "김준삼",
                    "학교", "동의대학교"
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
                    })
                    .toList()
                    .forEach(line -> {
                        try {
                            fileWriter.write(line + "\n");

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            fileWriter.close();
            System.out.println("내용 수정 완료");

        } catch (FileNotFoundException e) {
            System.out.println("파일 못 찾았어요");
        } catch (IOException e) {
            System.out.println("파일 내부의 내용을 읽지 못했습니다.");
        }
    }
}