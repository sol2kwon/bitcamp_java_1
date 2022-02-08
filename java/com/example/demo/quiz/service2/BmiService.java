package com.example.demo.quiz.service2;

import com.example.demo.domain.BmiDTO;

/**
 * packageName: com.example.demo.bmi
 * fileName        : BmiDemo.java
 * author          : solyikwon
 * date            : 2022-01-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         solyikwon      최초 생성
 **/
public class BmiService extends Object {
public String bmi(BmiDTO bmi){

   return String.format("%s정상",bmi.getName());
}}
