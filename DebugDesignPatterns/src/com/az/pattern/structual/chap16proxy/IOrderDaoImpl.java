package com.az.pattern.structual.chap16proxy;

public class IOrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao layer add Order successfully");
        return 1;
    }
}
