package com.example.demo;

import com.example.demo.quiz.service.Febe10Service;
import com.example.demo.quiz.service.Febe10ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : aaa.java
 * author          : solyikwon
 * date            : 2022-02-10
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-10         solyikwon      최초 생성
 **/
public class aaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Febe10Service febe10Service = new Febe10ServiceImpl();
        febe10Service.rectangleStarPrint(scanner);
    }
}
