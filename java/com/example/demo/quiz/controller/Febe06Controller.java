package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.QuizService;
import com.example.demo.quiz.service.QuziServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName        : Febe06Controller.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class Febe06Controller {
    public void execute(Scanner scanner) {
    String[] arr = {"김지혜", "최은아", "심민혜", "권솔이", "하진희",
            "깊이", "스택", "해시", "힙", "탐욕법",
            "너비", "큐", "동적계획법", "완전탐색", "이분탐색",
            "정렬", "그래프"};
    QuizService service = new QuziServiceImpl();
        while(true){
        System.out.println("[MENU] 0.EXIT\n " +
                "1.팀별 과제 출력 \n" +
                "2. 팀장이 맡은 과제만 출력 \n" +
                "3. 큐를 담당한 사람을 출력 \n" +
                "4.팀원별 과제 수를 출력\n");
        switch (scanner.next()) {
            case "0":
                System.out.println("시스템종료");
                return;
            case "1":
                service.quiz1(arr);
                break;
            case "2":
                service.quiz2(arr);
                break;
            case "3":
                service.quiz3(arr);
                break;
            case "4":
                service.quiz4(arr);
                break;
        }}}}

