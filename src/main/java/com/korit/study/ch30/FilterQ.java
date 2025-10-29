package com.korit.study.ch30;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;


class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}


class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student1 {
    String name;
    int mathScore;
    int englishScore;

    public Student1(String name, int mathScore, int englishScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
}


class Item1 {
    String name;
    int stock;
    boolean onSale;
    int price;

    public Item1(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getPrice() {
        return price;
    }
}

public class FilterQ {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(even);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");

        List<String> words5 = words.stream()
                .filter(s -> s.length() >= 5)
                .toList();

        System.out.println(words5);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");

        List<String> namesStartWithA = names.stream()
                .filter(s -> s.startsWith("A"))
                .toList();

        System.out.println(namesStartWithA);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);

        List<Integer> positiveNumbers = mixedNumbers.stream()
                .filter(n -> n > 0)
                .toList();

        System.out.println(positiveNumbers);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );

        List<String> products550 = products.stream()
                .filter(p ->  p.getPrice() >= 50000 && p.getPrice() <= 500000)
                .map(Product::getName)
                .toList();

        System.out.println(products550);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );

        List<String> gmails = emails.stream()
                .filter(s -> s.contains("gmail"))
                .toList();

        System.out.println(gmails);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Person1> people = Arrays.asList(
                new Person1("김철수", 25),
                new Person1("이영희", 17),
                new Person1("박민수", 30),
                new Person1("정지원", 16),
                new Person1("최수현", 22)
        );

        List<String> adults = people.stream()
                .filter(p -> p.getAge() > 18)
                .map(p -> p.getName() + "(" + p.getAge() + ")")
                .toList();

        System.out.println(adults);

        /// ///////////////////////////////////////////////////////////////////////////////////


        List<Student1> students = Arrays.asList(
                new Student1("김철수", 85, 90),
                new Student1("이영희", 92, 88),
                new Student1("박민수", 65, 70),
                new Student1("정지원", 78, 85),
                new Student1("최수현", 95, 92)
        );

        List<String> success = students.stream()
                .filter(s -> s.getMathScore() >= 80 && s.getEnglishScore() >= 80)
                .map(s -> s.getName())
                .toList();

        System.out.println(success);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> articles = Arrays.asList(
                "Java 프로그래밍 기초",
                "Python으로 배우는 머신러닝",
                "Java Stream API 완벽 가이드",
                "JavaScript 최신 기능",
                "Java Spring Boot 실전",
                "React 입문 강좌"
        );

        List<String> java = articles.stream()
                .filter(s -> s.contains("Java"))
                .toList();

        System.out.println(java);

        /// ///////////////////////////////////////////////////////////////////////////////////


        List<Item1> items = Arrays.asList(
                new Item1("노트북", 5, true, 1000000),
                new Item1("마우스", 0, true, 30000),
                new Item1("키보드", 10, false, 50000),
                new Item1("헤드셋", 3, true, 80000),
                new Item1("웹캠", 0, false, 60000)
        );

        List<String> filteredItems = items.stream()
                .filter(i -> i.getStock() > 0 && i.isOnSale() == true)
                .map(i -> i.getName())
                .toList();

        System.out.println(filteredItems);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> data = Arrays.asList("apple", null, "banana", "", null, "cherry", "");

        List<String> notNullData = data.stream()
                .filter(d -> !Objects.isNull(d) && !d.isBlank())
                .toList();

        System.out.println(notNullData);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> notDupleNum = numbers1.stream()
                .filter(num -> numbers1.stream()
                        .filter(num2 -> num2 == num).count() == 1)
                .toList();

//                .filter(n -> Collections.frequency(numbers1, n) == 1)

        System.out.println(notDupleNum);


//        List<Integer> notDupleNum2 = new ArrayList<>();
//        for (Integer num : numbers1) {
//            int count = 0;
//            for (Integer num2: numbers1) {
//                if (num2 == num) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                notDupleNum2.add(num);
//            }
//        }
//        System.out.println(notDupleNum2);




        /// ///////////////////////////////////////////////////////////////////////////////////

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );

        List<LocalDate> weekend = dates.stream()
                .filter(d -> d.getDayOfWeek().equals(DayOfWeek.SATURDAY) || d.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                .toList();

        System.out.println(weekend);
    }

}
