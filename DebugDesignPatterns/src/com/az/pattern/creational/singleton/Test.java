package com.az.pattern.creational.singleton;


public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println("program end");
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("done");
    }
}
