package com.az.pattern.creational.simplefactory;

import java.util.Calendar;

public class VideoTest {
    public static void main(String[] args) {
//        VideoFactory videoFActory = new VideoFactory();
//        Video video =  videoFActory.getVideo("java");
//        if(video == null){
//            return;
//        }
        VideoFactory videoFactory =  new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
