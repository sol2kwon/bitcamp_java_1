package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Febe07Service;
import com.example.demo.quiz.service.Febe07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : Febe7Controller.java
 * author          : solyikwon
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         solyikwon      최초 생성
 **/
public class Febe07Controller
/**
 * 1.주사위 dice
 * 2.가위바위보 Rps
 * 3.입력받은 두 수 사이의 있는 소수 구하기 getPrime
 * 4.자바로 입력받은 연도가 윤녕인지 평년인지 판단하기 LeapYear
 * 임의로 입력받은 숫자 맞추기 numberGolf
 */
{
    public void execute(Scanner scanner) {
        Febe07Service febe07Service = new Febe07ServiceImpl();
        while (true){
            System.out.println("0.종료 1.dice 2.Rps 3.getPrime 4.LeapYear 5.GuessNumber");
            switch (scanner.next()){
                case "0":
                    System.out.println("0.종료");

                case "1":
                    System.out.println("1.주사위 dice");
                    febe07Service.dice(scanner);

                    break;
                case "2":
                    System.out.println("2.가위바위보 Rps");
                    febe07Service.rps(scanner);
                    break;
                case "3":
                    System.out.println("3.입력받은 두 수 사이의 있는 소수 구하기 getPrime");
                    febe07Service.getPrime(scanner);
                    break;
                case "4" :
                    System.out.println("4.자바로 입력받은 연도가 윤녕인지 평년인지 판단하기 LeapYear");
                    febe07Service.leapYear(scanner);
                    break;
                case "5" :
                    System.out.println("5.임의로 번호 추출하기 GuessNumber");
                    febe07Service.guessNumber(scanner);
                    break;
            }
        }
    }


}
