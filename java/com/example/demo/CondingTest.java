package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : CondingTest.java
 * author          : solyikwon
 * date            : 2022-02-23
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-23         solyikwon      최초 생성
 **/
public class CondingTest {
    /**
     * 거스름돈 (87P)
     * 손님에게 N 원을 거슬러줘야한다.
     * 500원, 100원, 50원, 10원짜리 동전을 무한대로 가지고있다고 가정하고
     * 최소한의 동전 갯수로 거슬러주어라.
     * 단, 거스름돈의 액수는 항상 10의 배수이다.
     *
     * 조건 : N은 10~10000 사이의 10의 배수 이다.
     * */
    public static void main(String[] args) {
        int[] a = {500, 100, 50, 10};
        int[] aconin = new int[4];
        int b = 1260;
        String result = "";

        for (int i=0; i<a.length; i++){
            aconin[i]=b/a[i];
            b %=a[i];
            result += a[i] +"원 "+aconin[i]+" 개";
        }
            System.out.println(result);
    }}








