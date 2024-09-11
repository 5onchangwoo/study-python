package com.example.designpattern.stuctural.proxy.image;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        try {
            loadFromDisk();
        } catch (InterruptedException e) {
            System.out.println("이미지 로드에 실패하였습니다.");
        }
    }

    public String getFilename() {
        return filename;
    }

    private void loadFromDisk() throws InterruptedException {
        System.out.println("이미지 로드 시작...");
        // 1 ~ 3 초사이
        Thread.sleep(1000 + (long) (Math.random() * 2000));
        System.out.println("이미지 로드 완료...");
    }

    @Override
    public void display() {
        System.out.println("이미지 디스플레이: " + filename);
    }
}
