package com.az.pattern.structual.chap16proxy;

public class IOrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new IOrderDaoImpl();
        System.out.println("Server layer call Dao layer to add Order ");
        return iOrderDao.insert(order);
    }
}
