package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SignInDto;

public interface SignInService {

    void signin(SignInDto signInDto);
    boolean isEmpty(String str);    // 공백을 포함하면 안됨
}
