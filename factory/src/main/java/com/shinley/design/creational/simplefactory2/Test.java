package com.shinley.design.creational.simplefactory2;

public class Test {
    // 简单工厂
//    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//    }

    // 利用反射，弥补了简单工厂的可扩展性
    // 一定程度上实现了可扩展，而不需要修改VideoFactory
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
//
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
