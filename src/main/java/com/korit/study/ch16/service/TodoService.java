package com.korit.study.ch16.service;

import com.korit.study.ch16.repository.TodoList;
import com.korit.study.ch16.dto.TodoRegisterDto;
import com.korit.study.ch16.entity.Todo;
import com.korit.study.ch16.entity.User;

public class TodoService {

    TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }


    public void addTodo(TodoRegisterDto todoRegisterDto) {
        Todo todo = todoRegisterDto.toTodo();
        todo.setId(todoList.generateTodoId());
        todoList.add(todo);
    }

    public void printAllByUser(User user) {
        System.out.println("등록된 Todo리스트 조회");
        Todo[] foundTodos = todoList.findAllByUserId(user.getId());
        for (Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }

}
