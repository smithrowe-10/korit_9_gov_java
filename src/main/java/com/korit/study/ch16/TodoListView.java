package com.korit.study.ch16;

import com.korit.study.ch16.dto.SigninDto;
import com.korit.study.ch16.dto.SignupDto;
import com.korit.study.ch16.dto.TodoRegisterDto;
import com.korit.study.ch16.entity.User;
import com.korit.study.ch16.service.TodoService;
import com.korit.study.ch16.service.UserService;

import java.util.Scanner;

public class TodoListView {

    private Scanner scanner;
    private User principal = null;
    private UserService userService;
    private TodoService todoService;

    TodoListView(UserService userService, TodoService todoService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
    }

    void homeView() {
        while (true) {
            System.out.println("[ TodoList ]");
            System.out.println("1. TodoList");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(">> ");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {  // cmd는 null일 가능성이 있기 때문에 cmd.equals("q")는 클린코딩에 위배됨 물론 이 코드에서는 cmd를 초기화를 했기때문에 문제가 생기진 않음
                break;
            } else if ("1".equals(cmd)) {
                // todolist
                if (principal == null) {
                    System.out.println("로그인 후 사용가능합니다.");
                    continue;
                }
                todoListMenuView();
            } else if ("2".equals(cmd) && principal == null) {
                signupView();

            } else if ("2".equals(cmd) && principal != null) {
                // 로그아웃
                principal = null;
                System.out.println("==<< 로그아웃 완료!! >>==");
            } else if ("3".equals(cmd) && principal == null) {
                signinView();
            }
        }
    }

    void signupView() {
        System.out.println("[ 회원가입 ]");
        String username = null;
        while (true) {
            System.out.print("username >>");
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) {
                break;
            }
            System.out.println("이미 존재하는 사용자이름입니다.");
        }
        System.out.print("password >>");
        String password = scanner.nextLine();
        System.out.print("name >>");
        String name = scanner.nextLine();
        SignupDto signupDto = new SignupDto(username, password, name);
        System.out.println(signupDto.toString());
        userService.signup(signupDto);
        System.out.println("==<< 회원가입 완료!!! >>==");
        userService.printUserListAll();


    }

    void signinView() {
        System.out.println("[ 로그인 ]");
        System.out.print("username >>");
        String username = scanner.nextLine();
        System.out.print("password >>");
        String password = scanner.nextLine();
        SigninDto signinDto = new SigninDto(username, password);
        User foundUser = userService.signin(signinDto);
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인하세요");
            return;
        }
        principal = foundUser;
        System.out.println("==<< 로그인 성공!! >>==");
    }

    void todoListMenuView() {
        while (true) {
            System.out.println("[ TodoList Menu ]");
            System.out.println("1. Todo 등록");
            System.out.println("2. Todo 조회");
            System.out.println("b. 뒤로가기");
            System.out.print(">> ");
            String cmd = scanner.nextLine();

            if ("b".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                System.out.println("[ Todo 등록 ]");
                System.out.print("오늘 할 일 >> ");
                String contents = scanner.nextLine();
                TodoRegisterDto todoRegisterDto = new TodoRegisterDto(contents, principal);
                todoService.addTodo(todoRegisterDto);
                System.out.println("<<== Todo 등록 완료 >>==");
            } else if ("2".equals(cmd)) {
                System.out.println("[ Todo 조회 ]");
                todoService.printAllByUser(principal);
            }
        }
    }



}