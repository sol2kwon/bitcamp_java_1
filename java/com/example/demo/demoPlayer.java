package com.example.demo;

import com.example.demo.quiz.service.Febe08Service;
import com.example.demo.quiz.service.Febe08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : gugudan.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class demoPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Febe08Service febe08Service = new Febe08ServiceImpl();
        febe08Service.gugudan(scanner);
    }
}

