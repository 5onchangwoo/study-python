package com.example.designpattern.stuctural.bridge.remote;

import com.example.designpattern.stuctural.bridge.devices.Device;

public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("리모콘으로 전원 조작하기");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("리모콘으로 볼륨 낮추기");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("리모콘으로 볼륨 높이기");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("리모콘으로 채널 낮추기");
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("리모콘으로 채널 높이기");
        device.setVolume(device.getVolume() + 1);
    }
}
