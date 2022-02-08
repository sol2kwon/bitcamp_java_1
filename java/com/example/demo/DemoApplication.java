package com.example.demo;

import com.example.demo.auth.controller.AuthController;
import com.example.demo.phone.controller.PhoneController;
import com.example.demo.quiz.controller.QuizTempController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpringApplication.run(DemoApplication.class, args);
        AuthController authController = new AuthController();
        PhoneController phoneController = new PhoneController();
        QuizTempController quizTempController = new QuizTempController();
        while (true){
            System.out.println("[메인메뉴] 0.Exit 1.Auth 2.OOP 3.Quiz 4.Algorithm");
            switch (scanner.next()){
                case"0":
                    System.out.println("### Exit ###");return;
                case"1":
                    System.out.println("### Auth ###");break;
                case"2":
                    System.out.println("### OOP ###");
                    phoneController.execute(scanner);
                    break;
                case"3":
                    System.out.println("### Quiz ###");
                    QuizTempController.execute(scanner);
                break;
                case"4":
                    System.out.println("### Algorithm ###");break;

            }
        }

    }}