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
    private String ki;
    private String kg;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }


}




