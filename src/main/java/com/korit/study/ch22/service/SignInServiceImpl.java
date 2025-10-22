package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SignInDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SignInServiceImpl implements SignInService{

    private static SignInServiceImpl instance;
    private UserRepository userRepository;

    public static SignInServiceImpl getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SignInServiceImpl(UserRepository.getInstance());
        }
        return instance;
    }


    private SignInServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void signin(SignInDto signInDto) {

        // 로그인을 시도한 사용자이름 확인 userRepository에서
        // 해당 사용자 이름을 가진 User객체가 있는지 확인
        // 객체가 null이면 함수 탈출(사용자 정보를 다시 확인하세요.)

        // 비밀번호 일치 확인
        // 비밀번호가 일치하지 않으면 함수 탈출(사용자 정보를 다시 확인하세요.)
        User user = userRepository.findByUsername(signInDto.getUsername());

        if (user != null) {
            if (PasswordEncoder.match(signInDto.getPassword(), user.getPassword())) {
                System.out.println("로그인 성공: " + user);
            } else {
                System.out.println("사용자 정보를 다시 확인하세요");
            }
        } else {
            System.out.println("사용자 정보를 다시 확인하세요");
        }
    }

    @Override
    public boolean isEmpty(String str) {
        // username, password가 각각 공백이 아닌지 확인용도
        return !str.isBlank();
    }
}
