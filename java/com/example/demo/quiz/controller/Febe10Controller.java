package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Febe08Service;
import com.example.demo.quiz.service.Febe08ServiceImpl;
import com.example.demo.quiz.service.Febe10Service;
import com.example.demo.quiz.service.Febe10ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName        : Febe10Controller.java
 * author          : solyikwon
 * date            : 2022-02-10
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-10         solyikwon      최초 생성
 **/
public class Febe10Controller {
    public void execute (Scanner scanner){
        Febe10Service febe10Service =new Febe10ServiceImpl();
        while (true){
            System.out.println("0.종료 1.Lotto 2.Baseball 3.Booking 4.Bank 5.Gugudan");
            switch (scanner.next()){
                case"0":
                    System.out.println("종료");return;
                case"1":
                    System.out.println("### BubbleSort ###");
                    febe10Service.bubbleSort(scanner);
                    break;
                case"2":
                    System.out.println("### InsertionSort ###");
                    febe10Service.insertionSort(scanner);
                    break;
                case"3":
                    System.out.println("### SelectionSort ###");
                    febe10Service.selectionSort(scanner);
                    break;
                case"4":
                    System.out.println("### QuickSort ###");
                    febe10Service.quickSort(scanner);
                    break;
                case"5":
                    System.out.println("### MergeSort ###");
                    febe10Service.mergeSort(scanner);
                    break;
                case"6":
                    System.out.println("### MagicSquare ###");
                    febe10Service.magicSquare(scanner);
                    break;
                case"7":
                    System.out.println("### Zigzag ###");
                    febe10Service.zigzag(scanner);
                    break;
                case"8":
                    System.out.println("### RectangleStarPrint ###");
                    febe10Service.rectangleStarPrint(scanner);
                    break;
                case"9":
                    System.out.println("### TriangleStarPrint ###");
                    febe10Service.triangleStarPrint(scanner);
                    break;



                default:
                    System.out.println("WRONG");

            }}
        }


    }
