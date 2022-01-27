package com.example.demo.calc;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        System.out.println(CalcApp.website);
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println("숫자");
        int num1 = scanner.nextInt();
        System.out.println("연산자");
        String opcode = scanner.next();
        System.out.println("숫자");
        int num2 = scanner.nextInt();
        String result = calcApp.calc(num1,opcode,num2);
        System.out.println(result);



    }
}
