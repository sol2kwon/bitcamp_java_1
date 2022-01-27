package com.example.demo.loginswitch;


import java.util.Scanner;

public class LswitchDemo {
    public static void main(String[] args) {
        System.out.println(LswitchApp.web);
        Scanner scanner = new Scanner(System.in);
        LswitchApp loginApp = new LswitchApp();
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
