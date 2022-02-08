package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : gugudan.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단을 입력하세요");
        int count = scanner.nextInt();
        for (int i = 2; i < 10; i++) {
            if (count == i) {
                System.out.println(count + "단");
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + "X" + j + "=" + i * j);
                }
return;
        }}
        System.out.println("오류! 2~9까지 입력하세요");


    }}


