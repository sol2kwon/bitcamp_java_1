package com.example.demo.service2;

import com.example.demo.domain.CalcDTO;
import com.example.demo.domain2.Calc2DTO;

/**
 * packageName: PACKAGE_NAME
 * fileName        : Calc2App.java
 * author          : solyikwon
 * date            : 2022-02-02
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-02         solyikwon      최초 생성
 **/
public class Calc2Service {
    public String execute(Calc2DTO calc2) {
        int result = 0;

        switch (calc2.getOpcode2()){
            case "+" : result = calc2.getNum3() + calc2.getNum4();break;
            case "-":  result = calc2.getNum3() - calc2.getNum4();break;
            case "*" : result = calc2.getNum3() * calc2.getNum4();break;
            case "/" : result = calc2.getNum3() / calc2.getNum4();break;
        }
        String res = String.format(" %d %s %d = %d",calc2.getNum3(),calc2.getOpcode2(),calc2.getNum4(),result);
        return res;
    }
}
