package com.korit.study.ch30;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream (흐름) -> 한번 쓰면 다시 못씀
 * 1. 생성        - 스트림 객체 생성
 * 2. 중간 연산     - 변환, 필터링 (반복)
 * 3. 최종 연산     - 결과 도출 (반복) forEach(), collect(), count()
 *
 */

public class StreamMain {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);
        strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        // 스트림 객체 생성
        // 1. Stream 인터페이스의 static 메서드를 통해 생성
        Stream<String> stream = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();
        Stream<String> stream2 = Stream.of("a", "b", "c");

        // 2. 배열 또는 컬렉션을 Stream으로 변환하여 생성
        Stream<String> stream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> stream4 = List.of("a", "b", "c").stream();
        Stream<String> stream5 = Set.of("a", "b", "c").stream();
        Stream<String> stream6 = Map.of("a", "1", "b", "2", "c", "3").keySet().stream();
        Stream<String> stream7 = Map.of("a", "1", "b", "2", "c", "3").values().stream();
        Stream<Map.Entry<String, String>> stream8 = Map.of("a", "1", "b", "2", "c", "3").entrySet().stream();

        List<String> names = List.of("김준일", "김준이");

        // 여기서부터
        List<String> lastNames = new ArrayList<>();
        for (String name : names) {
            String lastName = name.substring(0, 1); // 문자열을 자르는 행위
            char lastName2 = name.charAt(0);
            lastNames.add(lastName);
        } // 새로운 리스트에 성만 떼서 추가하는 작업
        lastNames.forEach(System.out::println); // << 이렇게 해주면 바로 성만 쭉 출력이 됨
        // 여기까지가 한토막

        names.stream()
                .map(name -> name.substring(0, 1))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        /**
         * 리턴되는 값들을 스트림에 추가하는 것.
         * 그러면은 성만 자른 이 값이 새로운 스트림에 담기고
         * 그 담긴 값을 콜렉트 반복하면서 리스트로 변환을 해주는 것.
         *
         * 그리고 리스트에서 forEach 를 하도록 하라는...
         */

        // 중간 연산 map(), filter()
        // 1. map() 변환, 치환
        List<String> strNums = List.of("11", "20", "31"); // 100, 200, 300 으로 만들고 싶음.
        List<Integer> nums = StreamMap.map(strNums, strNum -> {
            int n = Integer.parseInt(strNum);
            if (n % 2 == 0) {
                return n * 10;
            }
            return n;
        });
    }

    class StreamMap {
        public static <T, R> List<R> map(List<T> list, Function<T, R> action) {
            Objects.requireNonNull(list);
            Objects.requireNonNull(action); // 알아서 null 체크를 해주는 것. null 이 아닌 것이 필수라는 뜻

//            if (Objects.isNull(list)) {
//                return null;
//            }
//            if (list.isEmpty()) {
//                return null;
//            }
            List<R> rList = new ArrayList<>();
            for (T t : list) {
                rList.add(action.apply(t));
            }
            return rList;
        }
    }
}
