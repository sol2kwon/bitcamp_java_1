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
        int b = 1260;
        int count = 0;
        int result = 0;
        int s = 0;

        for (int i = 0; i < a.length; i++){
            for (int k=0; k>a[i]; k++){
            result = b % a[i];
            count = b/a[i]+1;
                System.out.println(result + "//돈 나머지");
            System.out.println(count);
            }}}}







