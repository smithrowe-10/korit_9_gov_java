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

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%.1f", salary));
    }
}

class EmployeeDTO {
    String displayName;
    String salaryInfo;

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSalaryInfo() {
        return salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }
}


class Item {
    String name;
    int price;

    public Item(String name, int price) {
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

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
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

        List<String> infoUsernames = usernames.stream()
                .map(s -> "User : " + s)
                .collect(Collectors.toList());

        System.out.println(infoUsernames);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

        List<EmployeeDTO> employeeDTOS = employees.stream()
                .map(Employee::toDto)
                .toList();

        System.out.println(employeeDTOS);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");

        List<String> citiesFirst = cities.stream()
                .map(s -> s.substring(0,1))
                .toList();

        System.out.println(citiesFirst);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Boolean> flags = Arrays.asList(true, false, true, true, false);

        List<Boolean> reverseFlags = flags.stream()
                .map(b -> b.equals(false))
                .toList();

        System.out.println(reverseFlags);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);

        List<Double> fahrenheit = celsius.stream()
                .map(c -> (c * 9/5) + 32)
                .toList();

        System.out.println(fahrenheit);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");

        List<String> data = messyData.stream()
                .map(s -> s.trim())
                .toList();

        System.out.println(data);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );

        List<String> mails = emails.stream()
                .map(s -> s.substring(s.indexOf("@")))
                .toList();

        System.out.println(mails);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Integer> ages = Arrays.asList(25, 30, 35, 20, 45);
        int currentYear = 2024;

        List<Integer> birth = ages.stream()
                .map(n -> currentYear - n)
                .toList();

        System.out.println(birth);

        /// ///////////////////////////////////////////////////////////////////////////////////


        List<Item> items = Arrays.asList(
                new Item("사과", 3000),
                new Item("바나나", 2000),
                new Item("오렌지", 5000)
        );

        List<String> infoItems = items.stream()
                .map(s -> s.getName() + "(" + s.getPrice() + "원)")
                .toList();

        System.out.println(infoItems);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Student> students = Arrays.asList(
                new Student("김철수", 95),
                new Student("이영희", 82),
                new Student("박민수", 76),
                new Student("정지원", 68)
        );

        List<String> infoStudents = students.stream()
                .map(s -> s.getName() + ": " + (s.getScore() >= 90 ? "A" : s.getScore() >= 80 ? "B" : s.getScore() >= 70 ? "C" : "D"))
                .toList();

        System.out.println(infoStudents);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> filePaths = Arrays.asList(
                "/home/user/documents/report.pdf",
                "/var/log/system.log",
                "C:\\Users\\Admin\\Desktop\\image.jpg",
                "/downloads/music.mp3"
        );

        List<String> files = filePaths.stream()
                .map(s -> s.contains("/") ? s.substring(s.lastIndexOf("/") + 1) : s.substring(s.lastIndexOf("\\") + 1))
                .toList();

        System.out.println(files);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> phoneNumbers = Arrays.asList(
                "01012345678",
                "01098765432",
                "01055556666",
                "01011112222"
        );

        List<String> infoPhoneNumbers = phoneNumbers.stream()
                .map(s -> s.substring(0,3) + "-" + s.substring(3, 7) + "-" + s.substring(7,11))
                .toList();

        System.out.println(infoPhoneNumbers);

    }
}