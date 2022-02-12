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
    /**
     ★좌측 90도 직각삼각형
     랜덤 값을 생성한다.변수 rand는 20까지의 숫자중 랜덤이다.
     int i=0이고 i부터 rand 값 전까지 반복하며 1씩 늘어난다.
     int j=0이고,j부터 i까지 반복하여 1씩 늘어난다.조건을 만족하면 *을 출력한다.
     내부 for문을 완료하면 줄바꿈 실행
     ex) random값이 3이면 rand=3이다.
     i=0,0<3(3번 반복),1씩증가
     j=0, 0<=0,1씩증가 이때 만족하여
     *
     다시 for문으로 돌아가 j=1,1<=0, 1씩증가.
     이때 조건에 만족하지 못하여 내부 for문을 빠져 나와 외부 for문으로 돌아간다.
     i=1, 1<3,
     j=1, 1<=1,   -조건만족
     *(줄바꿈)
     **
     i=2, 2<3
     j=2, 1 2<=2 -조건만족
     *
     **(줄바꿈)
     ***
     i=3, 3<3   - 조건 불만족.끝.
     */
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
    /**
     ★정삼각형 별찍기
     랜덤 값을 생성한다.변수 rand1는 20까지의 숫자중 랜덤이다.
     ex)rand1=3이면
     i=0, 0<3 1씩증가
     j=0, 0<3-0 / j=1, 1<3-0/j=2, 2<3-0 조건에 만족하여 공백을 출력한다
     ```
     j=0, 0<0*2+1 1씩증가 조건에 만족하여 *출력한다.
     ```*
     줄을 바꾼뒤 맨 처음 for문으로 돌아가 3번 반복한다.
     ```*
     ``***
     *****
     */
    @Override
    public void triangleStarPrint(Scanner scanner) {
        Random random1 = new Random();
        int rand1 = random1.nextInt(20);
        for (int i = 0; i<rand1; i++){
            for (int j= 0; j < rand1-i; j++){
                System.out.printf(" ");
            }
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }}}