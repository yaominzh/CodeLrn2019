package com.az.pattern.behavioral.chap27state;

public class StopState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR can't do speed in stop state");
    }

    @Override
    public void pause() {
        System.out.println("ERROR can't do PAUSE in stop state");
    }

    @Override
    public void stop() {
        System.out.println("in Stop state");
    }
}
