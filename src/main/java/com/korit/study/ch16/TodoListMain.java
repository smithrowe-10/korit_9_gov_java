package com.korit.study.ch16;

import com.korit.study.ch16.repository.TodoList;
import com.korit.study.ch16.repository.UserList;
import com.korit.study.ch16.service.TodoService;
import com.korit.study.ch16.service.UserService;

public class TodoListMain {
    public static void main(String[] args) {

        UserList userList = new UserList();
        UserService userService = new UserService(userList);
        TodoList todoList = new TodoList();
        TodoService todoService = new TodoService(todoList);
        TodoListView view = new TodoListView(userService, todoService);

        view.homeView();

        System.out.println("==<< 프로그램 종료 >>==");


    }
}
