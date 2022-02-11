package com.example.demo.phone.domain;

/**
 * packageName: com.example.demo.phone.domain
 * fileName        : CellPhon.java
 * author          : solyikwon
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         solyikwon      최초 생성
 **/
public class CellPhone extends Phone {
    protected boolean portable;
    protected String move;


    public CellPhone(String kind, String company,String move){
       super(kind,company);
       this.move =move;
    }
    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return String.format("% 인 %s 제품을 사용해서 %s라고 %s라고 통화한다.", super.getKind(),super.getCompany(), super.getCall(),move);
    }}


