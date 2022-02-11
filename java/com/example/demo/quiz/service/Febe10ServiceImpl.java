package com.example.demo.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Febe10ServiceImpl.java
 * author          : solyikwon
 * date            : 2022-02-10
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-10         solyikwon      최초 생성
 **/
public class Febe10ServiceImpl implements Febe10Service {
    @Override
    public void bubbleSort(Scanner scanner) {

    }

    @Override
    public void insertionSort(Scanner scanner) {

    }

    @Override
    public void selectionSort(Scanner scanner) {

    }

    @Override
    public void quickSort(Scanner scanner) {

    }

    @Override
    public void mergeSort(Scanner scanner) {

    }

    @Override
    public void magicSquare(Scanner scanner) {

    }

    @Override
    public void zigzag(Scanner scanner) {

    }
// 좌측90도 직각삼각형 별찍기
    @Override
    public void rectangleStarPrint(Scanner scanner) {
        Random random = new Random();
        int rand = random.nextInt(20);
        for (int i = 0; i<rand; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    // 정삼각형 별찍기
    @Override
    public void triangleStarPrint(Scanner scanner) {
        Random random1 = new Random();
        int rand1 = random1.nextInt(20);
        for (int i = 0; i<rand1; i++){
            for (int j= 0; j < rand1-i; j++){
                System.out.printf(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }}}