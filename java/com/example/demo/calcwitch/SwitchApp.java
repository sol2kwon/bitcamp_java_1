package com.example.demo.calcwitch;

import java.util.Scanner;

public class SwitchApp {
    public static String website = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int result = 0;

       switch (opcode){
           case  "+": result = num1+num2; break;
           case  "-": result = num1-num2; break;
           case  "*": result = num1*num2; break;
           case  "/": result = num1/num2; break;
       }

        String resul = String.format("%d %s %d = %d",this.num1,this.opcode,this.num2,result);
        return resul;

    }
}
