package com.az.pattern.structual.facade;

public class GiftExchangeService {
    QualifyService qualifyService;
    PointPaymentService pointPaymentService;
    ShippingService shippingService;
    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            if(pointPaymentService.pay(pointsGift)){
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("orderred successfully. Order No. is " + shippingOrderNo);
            }
        }
    }

    public QualifyService getQualifyService() {
        return qualifyService;
    }

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public PointPaymentService getPointPaymentService() {
        return pointPaymentService;
    }

    public void setPointPaymentService(PointPaymentService pointPaymentService) {
        this.pointPaymentService = pointPaymentService;
    }

    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }
}
