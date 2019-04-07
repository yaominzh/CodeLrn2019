package com.az.pattern.structual.facade;

public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("chech " + pointsGift.getName() + " passs point quqlification");
        return true;
    }
}
