package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service.service
 * fileName        : Febe08ServiceImpl.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class Febe08ServiceImpl implements Febe08Service {


    @Override
    public void lotto(Scanner scanner) {
        }



    @Override
    public void baseball(Scanner scanner) {


    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

/**★구구단
 2~4단 5~9단을 두단으로 출력하는 책받침용 구구단이다.
 i는 줄이 바뀔때  6단 부터를 시작하기 위해  i값이 4증가라는 조건을 입력한다.
 j는 곱해지는 값이며 j가 0이t rue일때 ?단을 출력하고, false 일때 구구단 값을 출력한다.
 k는 2~5단을 나타내주기 위해 5번 반복하라는 조건을 준다.
 곱해지는 값이 9가 끝나면 줄을 바꾼다.
 ex)2~4단을 2까지만 두단으로 나타낸다고 가정해보자.
 i=2, i2<6, 2씩 증가
 j=0, 0<3, 1씩 증가
 k=0, k<2, 1씩 증가
 if(j==0) true (2+0)단을 출력한다.
 다시 내부 for문으로 돌아가 j=1,k=0 false값 (2+0)X1=(2+0)*1(탭)을 출력한다.
 j=1, k=1 false 값 (2+1)X1=(2+1)*1(탭)을 출력한다.
 j=1, k =2 조건에 불만족하여 for문을 빠져나온다.
 j=2, k=0 false 값 (2+0)X2=(2+0)*2(탭)
 J=2, K=1 false 값 (2+1)X2=(2+1)*2(탭)
 j=2, k=2로 조건에 불만족하여 for문을 빠져나온다.
 j=3으로 조건에 불만족하여 for 문을 줄을 바꾼 뒤 빠져나온다.
 i 값이 2 증가하여 i=4, j=0, k=0 이며 j==0 if 조건이 true이므로 (4+0)단을 출력한다.
 j=1,k=0 false 값 (4+0)X1=(4+0)*1(탭)을 출력한다.
 j=1,k=1 false 값 (4+1)X1=(4+1)*1(탭)을 출력한다.
 k=2로 조건에 불만족하여 for문을 빠져나온다.
 j=2,k=0 false 값 (4+0)X2=(4+0)*2(탭)을 출력한다.
 J=2,k=1 flase 값 (4+1)X2=(4+1)*2(탭)을 출력한다.
 k=2로 조건에 불만족하여 for문을 빠져나온다.
 i=6으로 조건에 불만족하여 줄바꿈을 한다. 끝.
 */
    @Override
    public void gugudan(Scanner scanner) {
        System.out.println("    ###구구단을 외워보자!###");
        for (int i = 2; i < 10; i+=4) {
            for (int j = 0; j < 10; j++) {
                for(int k = 0; k<4; k++){
                    //i=2 j=0 k=03
                    if (j==0){
                        System.out.print(" "+(i+k)+"단\t");
                    }else {
                        System.out.print((i + k) + "X" + j + "=" + ((i + k) * j) + "\t");
                    }
            }
                System.out.println();
        }
            System.out.println();
    }}}
