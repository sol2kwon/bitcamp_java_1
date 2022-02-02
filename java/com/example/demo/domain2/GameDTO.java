package com.example.demo.domain2;

/**
 * packageName: com.example.demo
 * fileName        : GameApp.java
 * author          : solyikwon
 * date            : 2022-02-02
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-02         solyikwon      최초 생성
 **/
public class GameDTO {
    public static String GG = "게임랜드에 로그인 해주세요";
    private String id2;
    private int pw2;
    private String name2;

    public String getId2(){
        return id2;
    }
    public void setId2(String id2){
        this.id2 = id2;
    }
    public int getPw2(){
        return pw2;
    }
    public void setPw2(int pw2){
        this.pw2 = pw2;
    }
    public String getName2(){
        return name2;
    }
    public void setName2(String name2){
        this.name2 = name2;
    }
}
