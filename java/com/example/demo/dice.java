package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : dice.java
 * author          : solyikwon
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         solyikwon      최초 생성
 **/
public class dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 주사위");
        int a = scanner.nextInt();
        System.out.println("두번째 주사위");
        int b = scanner.nextInt();
        System.out.println("세번째 주사위");
        int c = scanner.nextInt();

        if (a==b&&b==c){
            System.out.println(10000+a*1000+"원");
        }else if (a==b||a==c){
        System.out.println(1000+a*100+"원");
    }else if(b == c){
            System.out.println(1000+b*100+"원");
        }else
            System.out.println(Math.max(Math.max(a,b),c)*100+"원");

    }
}
