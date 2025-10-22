package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UserRepository {
    private static UserRepository instance;
    private List<User> users;
    private int autoIncrementId;

    private UserRepository() {
        users = new ArrayList<>();
        autoIncrementId = 1;
    }

    public static UserRepository getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepository();
        }
        return instance;
    }

    public void insert(User user) {
        user.setId(autoIncrementId++);
        users.add(user);
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User 배열: [ ");
        for (int i = 0; i < users.size(); i++) {
            stringBuilder.append(users.get(i));
            if (i != users.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}