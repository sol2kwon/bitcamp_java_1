package com.example.demo.service2;

import com.example.demo.domain2.GameDTO;
import com.example.demo.domain2.NaverDTO;

/**
 * packageName: com.example.demo
 * fileName        : GameDemo.java
 * author          : solyikwon
 * date            : 2022-02-02
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-02         solyikwon      최초 생성
 **/
 public class GameService {
    public String execute(GameDTO game) {
        String res = "";


        if (game.getId2().equals("AAAA")){
            if (game.getPw2()==123){
                {
                    res = String.format("아이디와 비밀번호 일치.%s님 로그인 성공",game.getName2());
                }
            }else
                res = String.format("아이디와 비밀번호 불일치.%s님 로그인 실패",game.getName2());
        }
        else {
            res = String.format("아이디와 비밀번호 불일치.%s님 로그인 실패",game.getName2());
        }
        return res;
    }
}





