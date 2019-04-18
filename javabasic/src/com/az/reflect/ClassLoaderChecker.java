package com.az.reflect;

public class ClassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader m = new MyClassLoader("/home/allenz/", "myClassLoader");
        Class c =m.loadClass("Test");
        System.out.println(c.getClassLoader());
        System.out.println(c.newInstance());
    }
}
