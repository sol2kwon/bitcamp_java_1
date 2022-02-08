package com.example.demo.phone.controller;

import com.example.demo.phone.service.PhoneService;
import com.example.demo.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : PhoneController.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class PhoneController {
    public static void execute(Scanner scanner) {
    PhoneService service = new PhoneServiceImpl();

    while(true){
        System.out.println("0.종료 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트");
        switch (scanner.next()){
            case "0":
                System.out.println("종료");
                return;
            case "1":
                System.out.println("1.집전화 REP");
                service.usePhone(scanner);
                break;
            case "2":
                System.out.println("2.휴대폰 REP");
                service.useCelPhone(scanner);
                break;
            case "3":
                System.out.println("3.아이폰 REP");
                service.useIPhone(scanner);
                break;
            case "4":
                System.out.println("4.갤럭시노트 REP");
                service.useGalPhone(scanner);
                break;

            default:
                System.out.println("오류");
                break;
        }

    }
}
}
