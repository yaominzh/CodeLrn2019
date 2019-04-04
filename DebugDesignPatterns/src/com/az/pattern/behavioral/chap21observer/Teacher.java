package com.az.pattern.behavioral.chap21observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question) arg;
        System.out.println(teacherName + "\'s" +course.getCourseName() + "received a notification: " + question.getQuestionContent());


    }
}
