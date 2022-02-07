package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : ArrayExam.java
 * author          : solyikwon
 * date            : 2022-02-04
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-04         solyikwon      최초 생성
 **/
public class Quiz {
    public static void main(String[] args) {
        String[] arr = {"김지혜", "최은아", "심민혜", "권솔이", "하진희",
                "깊이", "스택", "해시", "힙", "탐욕법",
                "너비", "큐", "동적계획법", "완전탐색", "이분탐색",
                "정렬", "그래프"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("번호를 눌러주세요. 0.종료 1.과제 2.담당과제 3.담당자 4.카운트");
        while (true){
            switch (scanner.next()){
                case "0":
                    System.out.println("시스템종료");return;
                case "1":
                    quiz1(arr);break;
                case "2":
                    quiz2(arr);break;
                case "3":
                    quiz3(arr);break;
                case  "4":
                    quiz4(arr);break;
            }
        }

    }

    private static void quiz3(String[] arr) {
        String s="";
        String b="큐";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
        for (int l = 0; l< arr.length; l++){
            if (arr[l].equals(b)){
                s += arr[l%5];

            }

        }
        System.out.println(s);
    }


    private static void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요");
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i]+"\t";

        }
        System.out.println(s);
    }

    private static void quiz2(String[] arr) {
        String s;
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        s ="";
        String a ="최은아";


        for (int i = 0; i< arr.length; i++) {
            if (arr[i].equals(a)) {
                for (int j = 0; j < 4; j++) {
                    s += arr[i + j * 5] + ",";

                }
                if (i==17){break;}
            }
        }
        System.out.println(s);
    }



    private static void quiz4(String[] arr) {
    System.out.println("Q4. 팀원별 과제 수를 출력하세요 ");
    String s = "";
    int[] intArr = new int[5];
    int[] resArr = new int[5];
        for(int i = 5; i< arr.length; i++){
        int a = i % 5;
        for(int j = 0; j<5; j++){
        if(a == j){
        intArr[j]++;
        }
        resArr = intArr;
        }
        }
        for(int i = 0; i< 5; i++){
        System.out.println(arr[i]+"("+resArr[i]+"), ");
        }

        }
}