package com.example.demo.quiz.service2;

import com.example.demo.domain.CalcDTO;

public class CalcService {
    public String calc(CalcDTO calc) {
        int result =0;
        switch (calc.getOpcode()){
            case "+" :result = calc.getNum1()+  calc.getNum2(); break;
            case "-": result = calc.getNum1() - calc.getNum2(); break;
            case "*": result = calc.getNum1() * calc.getNum2(); break;
            case "/": result = calc.getNum1() / calc.getNum2(); break;

        }
        String res = String.format("%d %s %d = %d",calc.getNum1(),calc.getOpcode(),calc.getNum2(),result);
        return res;
    }
}
