package com.example.designpattern.stuctural.bridge.devices;

public class Radio implements Device{
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("--------------------");
        System.out.println("| 라디오");
        System.out.println("| on = " + on);
        System.out.println("| volume = " + volume);
        System.out.println("| channel = " + channel);
        System.out.println("--------------------");
    }
}
