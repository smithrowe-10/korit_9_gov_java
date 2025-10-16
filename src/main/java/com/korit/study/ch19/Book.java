package com.korit.study.ch19;

import java.util.Objects;

public class Book {
    private String model;
    private String color;

    public Book(String model, String color) {
        this.model = model;
        this.color = color;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Car car)) return false;  // 매개변수로 받은 object 객체를 car로 다운캐스팅 Car car = (Car) o 랑 동일
//        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
//    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != Book.class) {
            return false;
        }
        Book car = (Book) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}