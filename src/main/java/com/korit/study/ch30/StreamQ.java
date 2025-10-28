package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

public class StreamQ {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squareNums = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squareNums);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");

        List<Integer> wordsSize = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(wordsSize);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);

        List<Double> tax = prices.stream()
                .map(n -> n * 110 / 100)
                .collect(Collectors.toList());

        System.out.println(tax);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        List<String> peopleNames = people.stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());

        System.out.println(peopleNames);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> usernames = Arrays.asList("john", "mary", "steve");

        List<String> infoUsernames = usernames.

    }




}
