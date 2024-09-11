package com.example.designpattern.stuctural.bridge.remote;

import com.example.designpattern.stuctural.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote{
    private int preMuteVolume = 0;

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("리모콘으로 무음모드 전환");
        if(this.device.getVolume() == 0) {
            this.device.setVolume(this.preMuteVolume);
            this.preMuteVolume = 0;
        } else {
            this.preMuteVolume = this.device.getVolume();
            this.device.setVolume(0);
        }
    }
}
