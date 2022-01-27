package com.example.demo.abc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.abc
 * fileName        : AbcDemo.java
 * author          : solyikwon
 * date            : 2022-01-26
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-26         solyikwon      최초 생성
 **/
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();
        String res = abcApp.getabc();
        System.out.println(res);


    }
}
