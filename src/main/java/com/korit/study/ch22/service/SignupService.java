package com.korit.study.ch22.service;

import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;

import java.util.Objects;

public class SignupService {

    // 1. instance static 변수
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {

    }

    public static SignupService getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        return Objects.isNull(foundUser);
    }

    public boolean isValidPassword(String password) {
        return !Objects.isNull(password) && !password.isBlank();
    }
}
