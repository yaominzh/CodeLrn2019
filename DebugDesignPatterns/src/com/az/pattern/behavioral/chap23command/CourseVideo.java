package com.az.pattern.behavioral.chap23command;

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println(this.name + "open");
    }
    public void close(){
        System.out.println(this.name + "close");
    }
}
