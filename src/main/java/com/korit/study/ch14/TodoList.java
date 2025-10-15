package com.korit.study.ch14;

public class TodoList {
    Todo[] todos;

    TodoList() {
        this.todos = new Todo[0];
    }

    int generateTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].id + 1;
    }


    void add(Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[temp.length - 1] = todo;
        todos = temp;
    }

    // 다건조회
    Todo[] findAllByUserId(int userId) {
        int foundTodoCount = 0;
        for (Todo todos : todos) {
            if (todos.user.id == userId) {
                foundTodoCount++;
            }
        }
        Todo[] foundTodos = new Todo[foundTodoCount];
        for (int i = 0, j = 0; i < todos.length; i++) {
            if (todos[i].user.id == userId) {
                foundTodos[j] = todos[i];
                j++;
            }
        }
        return foundTodos;
    }


}
