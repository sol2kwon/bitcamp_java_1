package com.example.demo.service2;

import com.example.demo.domain2.CareerDTO;

import java.util.IllegalFormatCodePointException;

/**
 * packageName: com.example.demo
 * fileName        : CareerDemo.java
 * author          : solyikwon
 * date            : 2022-02-02
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-02         solyikwon      최초 생성
 **/
public class CareerService {
    public String execute(CareerDTO career) {
        String  res ="";
        if (career.getYear1() > 3)
            System.out.println("경력");

        else {
            System.out.println("신입");
        }
        return res;
    }
}