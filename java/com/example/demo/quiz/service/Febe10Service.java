package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName        : Febe10Service.java
 * author          : solyikwon
 * date            : 2022-02-10
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-10         solyikwon      최초 생성
 **/
public interface Febe10Service {
    void bubbleSort(Scanner scanner);
    void insertionSort(Scanner scanner);
    void selectionSort(Scanner scanner);
    void quickSort(Scanner scanner);

    int[] quickSort(int[] array, int m, int n);

    void mergeSort(Scanner scanner);

    void mergeSort(int[] a);

    void magicSquare(Scanner scanner);

    void magicSquare();

    void zigzag(Scanner scanner);
    void rectangleStarPrint(Scanner scanner);
    void triangleStarPrint(Scanner scanner);
}
