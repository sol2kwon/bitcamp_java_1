package com.example.demo.quiz.service2;

import com.example.demo.domain.UserDTO;

public class LoginService {
    public String login(UserDTO login) {
        String res = "";
        String ID = login.getId();
        String PW = login.getPw();

        if (ID.equals("AAA")){
            if (PW.equals("AAA")){
                {
                    res = String.format("아이디와 비밀번호 일치.%s님 로그인 성공",login.getName());
                }
            }else
                    res = String.format("아이디와 비밀번호 불일치.%s님 로그인 실패",login.getName());
        }
        else {
            res = String.format("아이디와 비밀번호 불일치.%s님 로그인 실패",login.getName());
        }
        return res;
    }
}

