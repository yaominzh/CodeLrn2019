package com.az.pattern.structual.adapter.classadapter;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
