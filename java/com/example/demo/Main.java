package com.example.demo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : Main.java
 * author          : solyikwon
 * date            : 2022-01-30
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-30         solyikwon      최초 생성
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 90 && a <= 100) {
            System.out.println("A");
        }
        else if (a >= 80 && a <= 89) {
            System.out.println("B");
        }else if(a >= 70 && a <= 79) {
                System.out.println("C");
                }else if(a >= 60 && a <= 69) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
            }
        }


