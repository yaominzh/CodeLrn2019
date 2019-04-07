package com.az.pattern.behavioral.chap18iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {
    private List courseList;
    private int position;
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("return course, position is " + position);
        course =(Course) courseList.get(position);
        position ++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if(position<courseList.size()){
            return false;
        }
        return true;
    }
}
