package com.az.pattern.creational.singleton;

public class T implements Runnable{
    @Override
    public void run() {
//        LazySingleton lazySingleton= LazySingleton.getInstance();
        StaticInnerClassSingleton instance =StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  " + instance);

    }
}
