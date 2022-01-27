package com.example.demo.calc;

import java.util.Scanner;

public class CalcApp {
    public static String website = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int result = 0;

        if (opcode.equals("+")){
            result = num1 + num2;
        }else if (opcode.equals("-")){
            result = num1 - num2;
        }else if (opcode.equals("*")){
            result = num1 * num2;
        } else if (opcode.equals("/")){
            result = num1 / num2;
        }

        String resul = String.format("%d %s %d = %d",this.num1,this.opcode,this.num2,result);
        return resul;

    }
}
