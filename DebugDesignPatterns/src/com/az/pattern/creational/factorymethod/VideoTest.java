package com.az.pattern.creational.factorymethod;

public class VideoTest {
    public static void main(String[] args) {
        VideoFactory videoFactory =  new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
