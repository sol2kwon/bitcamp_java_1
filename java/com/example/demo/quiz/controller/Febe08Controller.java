package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Febe08Service;
import com.example.demo.quiz.service.Febe08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName        : Febe08Controller.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class Febe08Controller {
    public void execute (Scanner scanner){
        Febe08Service febe08Service =new Febe08ServiceImpl();
        while (true){
            System.out.println("0.종료 1.Lotto 2.Baseball 3.Booking 4.Bank 5.Gugudan");
            switch (scanner.next()){
                case"0":
                    System.out.println("종료");return;
                case"1":
                    System.out.println("### Lotto ###");
                    febe08Service.lotto(scanner);
                    break;
                case"2":
                    System.out.println("### Baseball ###");
                    febe08Service.baseball(scanner);
                    break;
                case"3":
                    System.out.println("### Booking ###");
                    febe08Service.booking(scanner);
                    break;
                case"4":
                    System.out.println("### Bank ###");
                    febe08Service.bank(scanner);
                    break;
                case"5":
                    System.out.println("### Gugudan ###");
                    febe08Service.gugudan(scanner);
                    break;

                default:
                    System.out.println("WRONG");

            }
        }

    }
}
