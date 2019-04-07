package com.az.pattern.structual.facade;

public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName() + " get into logistic system");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
