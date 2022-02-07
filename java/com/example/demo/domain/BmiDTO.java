package com.example.demo.domain;

/**
 * packageName: com.example.demo.bmi
 * fileName        : BmiApp.java
 * author          : solyikwon
 * date            : 2022-01-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         solyikwon      최초 생성
 **/
public class BmiDTO {
    public static String BMI = "bmi";
    private String name;
    private double ki;
    private double kg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKi() {
        return ki;
    }

    public void setKi(double ki) {
        this.ki = ki;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }
}




