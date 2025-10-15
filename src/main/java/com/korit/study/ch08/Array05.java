package com.korit.study.ch08;


import java.util.Scanner;

public class Array05 {
    public static String[] products = new String[] {"김준일", "김준이", "김준삼", "김준사", "김준오", "김준육", "김준칠", "김준팔", "김준구"};
    public static int[] prices = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        // 추가(Create), 조회(Read), 수정(Update), 삭제(Delete)
        System.out.println("[ 상품 관리 시스템 ]");
        showMainMenuView();
    }

    public static void showMainMenuView() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 조회");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectedNumber == 0) {
                isExit = true;
            } else if (selectedNumber == 1) {
                register();
            } else if (selectedNumber == 2) {
                showNameList();
            }
        }
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        String newProduct = null;
        int newPrice = 0;
        while (true) {
            System.out.println("[상품 추가 기능]");
            System.out.print("상품 이름 입력: ");
            newProduct = scanner.nextLine();
            System.out.print("상품 가격 입력: ");
            newPrice = scanner.nextInt();



            if (findByName(newProduct) == null) {
                break;
            }
            System.out.println("이미 존재하는 상품입니다. 다시 입력하세요.");
        }

        add(newProduct, newPrice);
        System.out.println("<< 상품 추가 완료. >>");
    }

    public static String findByName(String name) {
        for (String n : products ) {
            if (n.equals(name)) {
                return n;
            }
        }
        return null;
    }

    public static void add(String name, int price) {
        String[] newProducts = new String[products .length + 1];
        int[] newPrices = new int[prices.length + 1];
        for (int i = 0; i < products .length; i++) {
            newProducts[i] = products [i];
            newPrices[i] = prices[i];
        }
        newProducts[newProducts.length - 1] = name;
        newPrices[newPrices.length - 1] = price;
        products  = newProducts;
        prices = newPrices;
    }

    public static void showNameList() {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        while (true) {
            System.out.println("사용자 정보 조회");
            System.out.println("뒤로가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지를 찾을 수 없습니다.");
            } else {
                String[] namesOfProducts = productPagination(selectedPage, size);
                int[] namesOfPrice = pricePagination(selectedPage, size);
                for (int i = 0; i < namesOfProducts.length; i++) {
                    System.out.printf("%d. %s : %d$ \n", i + 1, namesOfProducts[i], namesOfPrice[i]);
                }
                System.out.println();

            }
        }

    }

    public static int getLastPage(int size) {
        return products .length % size == 0 ? products .length / size : products .length / size + 1;
    }

    public static String[] productPagination(int page, int size) {
        int startIndex = (page - 1) * size;
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && products .length % size != 0 ? products .length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = products [i];
        }
        return paginationArray;
    }

    public static int[] pricePagination(int page, int size) {
        int startIndex = (page - 1) * size;
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && prices.length % size != 0 ? prices.length % size : size;
        int[] paginationArray = new int[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = prices[i];
        }
        return paginationArray;
    }
}

