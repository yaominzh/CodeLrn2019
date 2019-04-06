package com.az.pattern.structual.adapter.objectadapter;


public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target adapterTarget = new Adapter();
        adapterTarget.request();
        System.out.println("test scenario for objectadapter");
    }
}
