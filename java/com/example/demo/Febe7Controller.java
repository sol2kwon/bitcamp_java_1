package com.example.demo;

import ch.qos.logback.core.pattern.color.WhiteCompositeConverter;

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
public class Febe7Controller
/**
 * 1.주사위 dice
 * 2.가위바위보 Rps
 * 3.입력받은 두 수 사이의 있는 소수 구하기 getPrime
 * 4.자바로 입력받은 연도가 윤녕인지 평년인지 판단하기 LeapYear
 * 임의로 입력받은 숫자 맞추기 numberGolf
 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Febe07Service febe07Service = new Febe07ServiceImpl();


        while (true){
            System.out.println("0.종료 1.dice 2.Rps 3.getPrime 4.LeapYear");
            String res;
            switch (scanner.next()){
                case "0":
                    System.out.println("0.종료");

                case "1":
                    System.out.println("1.주사위 dice");
                    febe07Service.dice(scanner);

                    break;
                case "2":
                    System.out.println("2.가위바위보 Rps");
                    febe07Service.Rps(scanner);
                    break;
                case "3":
                    System.out.println("3.입력받은 두 수 사이의 있는 소수 구하기 getPrime");
                    febe07Service.getPrime(scanner);
                    break;
                case "4" :
                    System.out.println("4.자바로 입력받은 연도가 윤녕인지 평년인지 판단하기 LeapYear");
                    febe07Service.LeapYear(scanner);
                    break;
            }
        }
    }


}
