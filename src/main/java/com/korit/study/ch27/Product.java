package com.korit.study.ch27;

public class Product {

    private final String name;
    private final int price;
    private final String size;

    private Product(String name, int price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {

        private String name;
        private int price;
        private String size;


        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(int price) {
            this.price = price;
            return this;
        }

        public ProductBuilder size(String size) {
            this.size = size;
            return this;
        }

        public Product build() {
            return new Product(name, price, size);
        }
    }
}