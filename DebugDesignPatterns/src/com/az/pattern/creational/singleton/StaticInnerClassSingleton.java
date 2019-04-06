package com.az.pattern.creational.singleton;

public class StaticInnerClassSingleton {
    private  StaticInnerClassSingleton() {
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
