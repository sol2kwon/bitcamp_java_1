package com.example.demo.phone.service;

import com.example.demo.phone.domain.CellPhone;
import com.example.demo.phone.domain.GalPhone;
import com.example.demo.phone.domain.IPhone;
import com.example.demo.phone.domain.Phone;

/**
 * packageName: com.example.demo
 * fileName        : PhoneServiceImpl.java
 * author          : solyikwon
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         solyikwon      최초 생성
 **/
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CellPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());

    }
}
