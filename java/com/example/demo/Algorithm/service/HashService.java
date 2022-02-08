package com.example.demo.Algorithm.service;

/**
 * packageName: com.example.demo.Algorithm.service
 * fileName        : HashService.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public interface HashService {
        String solution(String[] participant, String[] completion);
        boolean solution(String[] phone_book);
        int solution(String[][] clothes);
        int[] solution(String[] genres, int[] plays);
    }

