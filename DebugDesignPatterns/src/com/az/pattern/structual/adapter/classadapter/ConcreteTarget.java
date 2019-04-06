package com.az.pattern.structual.adapter.classadapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget");
    }
}
