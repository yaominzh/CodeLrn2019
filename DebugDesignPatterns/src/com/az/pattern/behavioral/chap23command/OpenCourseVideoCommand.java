package com.az.pattern.behavioral.chap23command;

public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();

    }
}
