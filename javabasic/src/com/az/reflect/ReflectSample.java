package com.az.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class rc= Class.forName("com.az.reflect.Robot");
        Robot r = (Robot) rc.newInstance();
        System.out.println("Class name is " + rc.getName());
        r.sayHi("bob");
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);
        getHello.setAccessible(true);
        Object str = getHello.invoke(r, "bob");
        System.out.println("getHello result is " + str);
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));

    }
}
