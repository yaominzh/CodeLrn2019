package com.az.pattern.structual.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
