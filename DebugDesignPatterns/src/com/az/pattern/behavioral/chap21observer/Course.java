package com.az.pattern.behavioral.chap21observer;

import java.util.Observable;

public class Course  extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void produceQuestion(Course course, Question quesion){
        System.out.println(quesion.getQuestionContent()+ "raised a queston at " +course.courseName);
        setChanged();
        notifyObservers(quesion);
    }
}
