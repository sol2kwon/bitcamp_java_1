package com.example.demo;

/**
 * packageName: com.example.demo
 * fileName        : Dice11.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class dice {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            System.out.println(count+"번째 시도");
            System.out.println("첫번째 주사위"+a+"\n두번째 주사위"+b);
            count++;
            if (a == b) {
                break;
            }

        }
        }
    }



