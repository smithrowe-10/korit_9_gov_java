package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ID = "";
        String productCode = "";
        String productName = "";
        int stock = 0;
        int price = 0;
        int addressCode = 0;
        String address = "";

        System.out.print("고객 ID를 입력하세요 : ");
        ID = scanner.nextLine();
        System.out.print("상품 코드를 입력하세요 : ");
        productCode = scanner.nextLine();
        System.out.print("상품명을 입력하세요 : ");
        productName = scanner.nextLine();
        System.out.print("수량을 입력하세요 : ");
        stock = scanner.nextInt();
        System.out.print("단가를 입력하세요 : ");
        price = scanner.nextInt();
        System.out.print("우편번호를 입력하세요 : ");
        addressCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("배송 주소를 입력하세요 : ");
        address = scanner.nextLine();

        int total = price*stock;
        int deliveryFee = total >= 30000 ? 0 : 3000;
        String delivery = total >= 30000 ? "무료 (3만원 이상 구매)" : "배송비 3천원 추가";


        //여러줄 한번에쓰기 alt shift하고 클릭

        System.out.println("=== 주문 확인서 ===");
        System.out.printf("고객 ID : %s" + System.lineSeparator(), ID);
        System.out.println("상품 정보 : ");
        System.out.printf("\t- 상품코드 : %s" + System.lineSeparator(), productCode);
        System.out.printf("\t- 상품명 : %s" + System.lineSeparator(), productName);
        System.out.printf("\t- 단가 : %,d원 x %d개 = %,d원" + System.lineSeparator(), price, stock, total);
        System.out.println("배송 정보 : ");
        System.out.printf("\t- 우편번호 : %d" + System.lineSeparator(), addressCode);
        System.out.printf("\t- 주소 : %s" + System.lineSeparator(), address);
        System.out.printf("\t- 배송비 : %s" + System.lineSeparator(), delivery);
        System.out.printf("총 결제 금액 : %,d원", total+deliveryFee);

        scanner.close();




    }
}
