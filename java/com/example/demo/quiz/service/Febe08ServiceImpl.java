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
            for (int i = 2; i < 10; i+=4) {
                for (int j = 1; j < 10; j++) {
                    if (j == 1) {
                        for (int a = 0; a < 4; a++) {
                            System.out.print((i + a) + "단 \t");
                        }
                        System.out.println();
                    }
                    for(int k = 0; k<4; k++){
                        System.out.print((i+k)+"X"+j+"="+((i+k)*j)+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
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
        System.out.println("    ###구구단을 외워보자!###");
        for (int i = 2; i < 10; i+=4) {
            for (int j = 0; j < 10; j++) {
                for(int k = 0; k<4; k++){
                    //i=2 j=0 k=03
                    if (j==0){
                        System.out.print(" "+(i+k)+"단\t");
                    }else {
                        System.out.print((i + k) + "X" + j + "=" + ((i + k) * j) + "\t");
                    }
            }
                System.out.println();
        }
            System.out.println();
    }
    }}
