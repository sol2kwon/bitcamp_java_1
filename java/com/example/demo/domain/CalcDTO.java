package com.example.demo.domain;

import com.example.demo.phone.domain.CellPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;
import jdk.jshell.Snippet;

public class CalcDTO {
    public static String CALC = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    protected String aaa;
    protected String bbb;
    protected String ccc;

    public int getNum1() {

        return num1;
    }

    public void setNum1(int num1) {

        this.num1 = num1;
    }

    public String getOpcode() {

        return opcode;
    }

    public void setOpcode(String opcode) {

        this.opcode = opcode;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {

        this.num2 = num2;
    }
}


