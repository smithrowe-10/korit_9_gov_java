package com.korit.study.ch16.repository;

import com.korit.study.ch16.entity.Todo;

public class TodoList {
    private Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0];
    }

    public int generateTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].getId() + 1;
    }


    public void add(Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[temp.length - 1] = todo;
        todos = temp;
    }

    // 다건조회
    public Todo[] findAllByUserId(int userId) {
        int foundTodoCount = 0;
        for (Todo todos : todos) {
            if (todos.getUser().getId() == userId) {
                foundTodoCount++;
            }
        }
        Todo[] foundTodos = new Todo[foundTodoCount];
        for (int i = 0, j = 0; i < todos.length; i++) {
            if (todos[i].getUser().getId() == userId) {
                foundTodos[j] = todos[i];
                j++;
            }
        }
        return foundTodos;
    }
}
