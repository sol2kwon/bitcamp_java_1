package com.example.demo.loginswitch;

public class LswitchApp {
    public static String web = "안녕하십니까";
    String id;
    String pw;
    String name;
    String PASSWORD = "abc";

    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        String result = "id";

        switch (pw) {
            case "abc":
                result = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw);
                break;
            default:
                result = String.format("%s ID는 맞고, 비번 %s가 틀립니다. 로그인 실패", this.id, this.pw);
                break;
        }
        return result;

    }
}


