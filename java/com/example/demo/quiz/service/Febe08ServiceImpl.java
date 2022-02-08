package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service.service
 * fileName        : Febe08ServiceImpl.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class Febe08ServiceImpl implements Febe08Service {


    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {
            while (true) {
                System.out.println("단을 입력하세요.[종료버튼:1]");
                int count = scanner.nextInt();
                if (count == 1) {
                    break;
                }
                if (count > 9) {
                    System.out.println("오류! 2~9까지 입력하세요");
                    continue;
                }
                for (int i = 2; i < 10; i++) {
                    if (count == i) {
                        System.out.println(count + "단");
                        for (int j = 1; j < 10; j++) {
                            System.out.println(i + "X" + j + "=" + i * j);
                        }
                    }
                }
            }



    }
}
