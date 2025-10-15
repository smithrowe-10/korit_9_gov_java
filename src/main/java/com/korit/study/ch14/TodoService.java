package com.korit.study.ch14;

import java.security.Principal;

public class TodoService {

    TodoList todoList;

    TodoService(TodoList todoList) {
        this.todoList = todoList;
    }


    void addTodo(TodoRegisterDto todoRegisterDto) {
        Todo todo = todoRegisterDto.toTodo();
        todo.id = todoList.generateTodoId();
        todoList.add(todo);
    }

    void printAllByUser(User user) {
        System.out.println("등록된 Todo리스트 조회");
        Todo[] foundTodos = todoList.findAllByUserId(user.id);
        for (Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }

}
