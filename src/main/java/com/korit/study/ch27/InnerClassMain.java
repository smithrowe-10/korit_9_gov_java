package com.korit.study.ch27;

public class InnerClassMain {

    public static void main(String[] args) {

        User user = new User("test", "1234");
        System.out.println(user);

        User.UserPrinter userPrinter = user.new UserPrinter(user.toString());
        userPrinter.print();

        User.UserPrinter2 userPrinter2 = new User.UserPrinter2(user.toString());
        userPrinter2.print();

    }

}
