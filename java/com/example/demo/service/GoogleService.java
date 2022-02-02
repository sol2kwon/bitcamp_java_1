package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.service
 * fileName        : GoogleApp.java
 * author          : solyikwon
 * date            : 2022-01-29
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-29         solyikwon      최초 생성
 **/
public class GoogleService {
    public String execute(GoogleDTO google) {
        System.out.println(google.getWord());
        return "";
    }
}
