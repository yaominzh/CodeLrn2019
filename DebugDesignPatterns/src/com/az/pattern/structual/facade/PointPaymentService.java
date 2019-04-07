package com.az.pattern.structual.facade;

public class PointPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("payment " + pointsGift.getName() + "successfull");
        return true;
    }
}
