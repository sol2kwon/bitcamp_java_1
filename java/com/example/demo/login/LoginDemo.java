package com.example.demo.login;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        System.out.println(LoginApp.web);
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        System.out.println("name");
        String name = scanner.next();
        String result = loginApp.login(id,pw,name);
        System.out.println(result);


    }
}
