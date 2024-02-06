package com.example.designpattern.stuctural.bridge;

import com.example.designpattern.stuctural.bridge.devices.Device;
import com.example.designpattern.stuctural.bridge.devices.Radio;
import com.example.designpattern.stuctural.bridge.devices.Tv;
import com.example.designpattern.stuctural.bridge.remote.AdvancedRemote;
import com.example.designpattern.stuctural.bridge.remote.BasicRemote;

public class BridgeMain {
    public static void main(String[] args) {
        controlTestDevice(new Tv());
        System.out.println("====================");
        controlTestDevice(new Radio());
    }

    private static void controlTestDevice(Device device) {
        System.out.println("리모콘 테스트");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.volumeUp();
        device.printStatus();

        System.out.println("고급 리모콘 테스트");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
        advancedRemote.mute();
        device.printStatus();
    }

}
