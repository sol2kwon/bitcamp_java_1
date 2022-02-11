package com.example.demo.auth.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName        : StudentService.java
 * author          : solyikwon
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         solyikwon      최초 생성
 **/
public interface MemberService {
    String getbmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String google(GoogleDTO google);
    String getgrade(GradeDTO grade);
    String getlogin(UserDTO login);
}
