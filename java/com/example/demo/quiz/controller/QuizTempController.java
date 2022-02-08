package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : QuizTempController.java
 * author          : solyikwon
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         solyikwon      최초 생성
 **/
public class QuizTempController {
    public static void execute(Scanner scanner) {
        Febe07Service febe07Service = new Febe07ServiceImpl();
       Febe08Service febe08Service = new Febe08ServiceImpl();


        while (true) {
            System.out.println("[서브메뉴] 0.Exit 1)2월6일 2)2월7일 3)2월 8일 4)2월 9일");
            switch (scanner.next()) {
                case "0":
                    System.out.println("### EXit ###");
                    return;
                case "1":
                    System.out.println("### 2월6일 ###");

                    break;
                case "2":
                    System.out.println("[소메뉴]\n 0.Exit \n1.주사위 \n2.가위바위보 \n3.소수 구하기\n 4.윤년/평년\n 5.임의숫자 맞추기");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("### 종료 ###");
                            return;
                        case "1":
                            System.out.println("### 1.주사위 ###");
                            febe07Service.dice(scanner);
                            break;
                        case "2":
                            System.out.println("### 2.가위바위보 ###");
                            febe07Service.rps(scanner);
                            break;
                        case "3":
                            System.out.println("### 3.소수 구하기 ###");
                            febe07Service.getPrime(scanner);
                            break;
                        case "4":
                            System.out.println("### 4.윤년/평년 ###");
                            febe07Service.leapYear(scanner);
                            break;
                        case "5":
                            System.out.println("### 5.임의숫자 맞추기 ###");
                            febe07Service.guessNumber(scanner);
                            break;
                    }
                case "3":
                    System.out.println("[소메뉴]\n 0.종료 1.Lotto 2.Baseball 3.Booking 4.Bank 5.Gugudan");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("### 종료 ###");return;
                        case "1":
                            System.out.println("### 1. Lotto ###");
                            febe08Service.lotto(scanner);
                            break;
                        case "2":
                            System.out.println("### 2.Baseball ###");
                            febe08Service.baseball(scanner);
                            break;
                        case "3":
                            System.out.println("### 3.Booking ###");
                            febe08Service.booking(scanner);
                            break;
                        case "4":
                            System.out.println("### 4.Bank ###");
                            febe08Service.bank(scanner);
                            break;
                        case "5":
                            System.out.println("### 5.Gugudan ###");
                            febe08Service.gugudan(scanner);
                            break;

                    }
                case "4":
                    System.out.println("### 2월 9일 ###");

                    break;
            }
        }
    }
}