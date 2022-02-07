package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : Febe07ServiceImpl.java
 * author          : solyikwon
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         solyikwon      최초 생성
 **/

/**
 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 *
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 *
 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 */

public class Febe07ServiceImpl implements Febe07Service{
    @Override
    public void dice(Scanner scanner) {
        System.out.println("첫번째 주사위");
        int a = scanner.nextInt();
        System.out.println("두번째 주사위");
        int b = scanner.nextInt();
        System.out.println("세번째 주사위");
        int c = scanner.nextInt();

        if (a==b&&b==c){
            System.out.println(10000+a*1000+"원");
        }else if (a==b||a==c){
            System.out.println(1000+a*100+"원");
        }else if(b == c){
            System.out.println(1000+b*100+"원");
        }else
            System.out.println(Math.max(Math.max(a,b),c)*100+"원");

    }

    @Override
    public void Rps(Scanner scanner) {

    }

    @Override
    public void getPrime(Scanner scanner) {

    }

    @Override
    public void LeapYear(Scanner scanner) {

    }
}
