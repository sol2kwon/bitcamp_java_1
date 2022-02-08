
package com.example.demo.Algorithm.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Algorithm.controller
 * fileName        : AlgorithmController.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class AlgorithmController {
    public void execute(Scanner scanner) {
        while (true) {
            System.out.println("[담당] 0.종료 1.심민혜 2.권솔이 3.김지혜 4.하진희 5.최은아");
            switch (scanner.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("[소메뉴] 0.Exit 1.Hash 2.DP");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            System.out.println("Hash");
                            break;
                        case "2":
                            System.out.println("DP");
                            break;
                    }
                case "2":
                    System.out.println("[소메뉴] 0.Exit 1.BruteForce 2.Heap");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료")
                            ;
                            return;
                        case "1":
                            System.out.println("BruteForce");
                            break;
                        case "2":
                            System.out.println("Heap");
                            break;
                    }
                case "3":
                    System.out.println("[소메뉴] 0.Exit 1.DFS 2.BFS 3.Sort");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            System.out.println("DFS");
                            break;
                        case "2":
                            System.out.println("BFS");
                            break;
                        case "3":
                            System.out.println("Sort");
                            break;
                    }
                case "4":
                    System.out.println("[소메뉴] 0.Exit 1.Greedy 2.Binary");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            System.out.println("Greedy");
                            break;
                        case "2":
                            System.out.println("Binary");
                            break;

                    }
                case "5":
                    System.out.println("[소메뉴] 0.Exit 1.Stack 2.Queue 3.Graph");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            System.out.println("Stack");
                            break;
                        case "2":
                            System.out.println("Queue");
                            break;
                        case "3":
                            System.out.println("Graph");
                            break;}
            }


        }
    }
}