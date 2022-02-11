package com.example.demo.phone.service;

import com.example.demo.phone.domain.CellPhone;
import com.example.demo.phone.domain.GalPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;

/**
 * packageName: com.example.demo
 * fileName        : PhoneService.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public interface PhoneService {
    void usePhone(Phone phone);

    void useCelPhone(CellPhone phone);

    void useIPhone(IPhone phone);

    void useGalPhone(GalPhone phone);

}
