package com.geely.design.principle.dependenceinversion;

/**
 * Created by geely
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
