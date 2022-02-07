package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.service.StudentService;

import java.util.Scanner;

/*
 * packageName: com.example.demo.controller
 * fileName        : DemoController.java
 * author          : solyikwon
 * date            : 2022-01-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         solyikwon      최초 생성
 **/

public class StudentController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc= new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        StudentService studentService = new StudentServiceImpl();




        while (true) {
            System.out.println("0.Exit 1.BMI 2.CACLC 3.GOOGLE 4.GRADE 5.LOGIN 6.COUNT ");
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("종료");return;
                case "1" :
                    System.out.println(BmiDTO.BMI+"\n이름, 키, 킬로그램");
                    bmi.setName(scanner.next());
                    bmi.setKi(scanner.nextDouble());
                    bmi.setKg(scanner.nextDouble());
                    res =studentService.getbmi(bmi);
                    break;

                case "2" :
                    System.out.println(CalcDTO.CALC+"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res =studentService.calc(calc);
                    break;

                case "3" :
                System.out.println(GoogleDTO.GOOGLE+"\n겸색어 입력");
                google.setWord(scanner.next());
                res = studentService.google(google);
                break;

                case "4" :
                System.out.println(GradeDTO.GRADE_TITLE+"\n이름, 국어, 영어,수학 입력");
                grade.setName(scanner.next());
                grade.setKor(scanner.nextInt());
                grade.setEng(scanner.nextInt());
                grade.setMath(scanner.nextInt());
                res = studentService.getgrade(grade);
                break;

                case "5" :
                    System.out.println(LoginDTO.WEB+"\n아이디, 비번,이름 입력");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res =studentService.getlogin(login);

                case "6" :
                    System.out.println("학생수, 이름, 수학, 영어, 국어 점수 입력");



                ;break;

                default : res = "WRONG"; break;

            }
            System.out.println(res);
        }
    }
}

/* for (int i = 0; i < 2; i++) {
            System.out.println("메뉴 선택");
            String menu = "1.CALC 2.SWITCH 3.GRADE 4.LOGIN 5.BMI";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select){
                case "1" : res = "1.CALC"; break;
                case "2" : res = "2.SWITCH"; break;
                case "3" : res = "3.GRADE";break;
                case "4" : res = "4.LOGIN";break;
                case "5" : res = "5.BMI";break;
                default :  res = "메뉴없음";break;
 */