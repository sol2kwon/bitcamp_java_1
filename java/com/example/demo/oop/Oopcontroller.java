package com.example.demo.oop;

import com.example.demo.phone.domain.CellPhone;
import com.example.demo.phone.domain.GalPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;
import com.example.demo.phone.service.PhoneService;
import com.example.demo.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.OopController
 * fileName        : Oopcontroller.java
 * author          : solyikwon
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         solyikwon      최초 생성
 **/
public class Oopcontroller {
    public static void execute(Scanner scanner) {
        while (true) {
            System.out.println("[메뉴] 0.exit \n 1.은닉화(Encapsulation)\n" + "2.상속(Inheritance)\n" + "3.추상화(Abstraction)\n" + "4.다형성(Polymorphism)\n");
            switch (scanner.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("POJO가 은닉화다");
                    break;
                case "2":
                    System.out.println("extends가 상속이다");
                    Phone phone = new Phone("금성전화기","금성전자");
                    CellPhone celPhone = new CellPhone("핸드폰","블랙베리","이동중에");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴] 0.exit 1.집전화 2.휴대폰 3.아이폰 4.갤럭시폰");
                    switch (scanner.next()) {
                        case "1":
                            phone.setCall("여보세요?");
                            phoneService.usePhone(phone);
                            break;
                case "2":
                    celPhone.setCall("안녕하세요");
                    phoneService.useCelPhone(celPhone);
                    break;
                case "3":
                    iPhone.setSearch("뉴스");
                    phoneService.useIPhone(iPhone);
                    break;
                        case "4":
                            galPhone.setPay("삼성 페이");
                            phoneService.useGalPhone(galPhone);
                            break;
            }}

        }
    }}
