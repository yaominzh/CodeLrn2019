package com.geely.design.principle.dependenceinversion;

/**
 * Created by geely
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }

}
