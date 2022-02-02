package com.example.demo;

import com.example.demo.domain2.Calc2DTO;
import com.example.demo.domain2.CareerDTO;
import com.example.demo.domain2.GameDTO;
import com.example.demo.domain2.NaverDTO;
import com.example.demo.service2.Calc2Service;
import com.example.demo.service2.CareerService;
import com.example.demo.service2.GameService;




import com.example.demo.service2.NaverService;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName        : ExController.java
 * author          : solyikwon
 * date            : 2022-02-02
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-02         solyikwon      최초 생성
 **/
public class ExController {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Calc2DTO calc2 = new Calc2DTO();
    Calc2Service calc2Service = new Calc2Service();
    NaverDTO naver = new NaverDTO();
    NaverService naverService = new NaverService();
    GameDTO game = new GameDTO();
    GameService gameService = new GameService();
    CareerDTO career = new CareerDTO();
    CareerService careerService = new CareerService();




    while (true){
        System.out.println("0.종료 1.계산기 2.단어검색 3.성적 4.로그인성공 5.채용");
        String res ="";
        switch (scanner.next()){
            case "0":
                System.out.println("종료");return;
            case "1":
                System.out.println("숫자 , 연산자 , 숫자 입력");
                calc2.setNum3(scanner.nextInt());
                calc2.setOpcode2(scanner.next());
                calc2.setNum4(scanner.nextInt());
                res = calc2Service.execute(calc2);
                break;

            case "2":
                System.out.println(NaverDTO.INSA+"\n 검색 단어 입력");
                naver.setA(scanner.next());
                res = naverService.execute(naver);
                break;



            case "4":
                System.out.println(GameDTO.GG+"\n 아이디 비밀번호 입력");
                game.setId2(scanner.next());
                game.setPw2(scanner.nextInt());
                game.setName2(scanner.next());
                res = gameService.execute(game);
                break;

            case "5":
                System.out.println(CareerDTO.web+"\n 근무년수 입력");
                career.setYear1(scanner.nextInt());
                res = careerService.execute(career);
                break;

            default:res = "WRONG";break;


        }
        System.out.println(res);

    }


}
}
