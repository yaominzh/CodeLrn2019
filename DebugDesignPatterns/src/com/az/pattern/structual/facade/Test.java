package com.az.pattern.structual.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T-shirt");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setPointPaymentService(new PointPaymentService());
        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointsGift);
    }
}
