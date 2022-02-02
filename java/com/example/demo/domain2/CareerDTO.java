package com.example.demo.domain2;

/**
 * packageName: com.example.demo
 * fileName        : CareerApp.java
 * author          : solyikwon
 * date            : 2022-02-02
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-02         solyikwon      최초 생성
 **/
public class CareerDTO {
    public static String web = "신입/경력을 구분해주세요";
    private int year1 = 0;

    public int getYear1(){
        return year1;
    }
    public void setYear1(int year1){
        this.year1 = year1;
    }

}
