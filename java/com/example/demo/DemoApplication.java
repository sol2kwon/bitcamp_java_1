package com.example.demo;

import com.example.demo.Algorithm.controller.AlgorithmController;
import com.example.demo.auth.controller.AuthController;
import com.example.demo.oop.Oopcontroller;
import com.example.demo.quiz.controller.QuizTempController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;


@SpringBootApplication
class Demo1Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[메인메뉴] 0.EXIT 1. Auth 2. OOP  3. Quiz 4.Algorithm");

            switch (scanner.next()) {
                case "0":
                    System.out.println("### Exit ###");
                    return;
                case "1":
                    System.out.println("### Auth ###");
                    AuthController.execute(scanner);
                    break;

                case "2":
                    System.out.println("### OOP ###");
                    Oopcontroller.execute(scanner);
                    break;
                case "3":
                    System.out.println("### Quiz ###");
                    QuizTempController.execute(scanner);

                    break;
                case "4":
                    System.out.println("### Algorithm ###");
                    AlgorithmController.execute(scanner);
                    break;
                default:
                    System.out.println(" Wrong Number ");

            }

        }


    }
}