package org.example.labs.lab2.Bridge;

public class BasicRemote implements Remote {
    protected Device device;

    //конструктор
    public BasicRemote() {}
    //конструктор
    public BasicRemote(Device device) { this.device = device; }

    public String power() {
        if(device.isEnabled()) {
            device.disable();
        } else { device.enable(); }
        return "Remote: power toggle";
    }

    public String volumeDown() {
        device.setVolume(device.getVolume() - 10);
        return "Remote: volume down";
    }

    public String volumeUp() {
        device.setVolume(device.getVolume() + 10);
        return "Remote: volume up";
    }

    public String channelDown() {
        device.setChannel(device.getChannel() - 1);
        return "Remote: channel down";
    }

    public String channelUp() {
        device.setChannel(device.getChannel() + 1);
        return "Remote: channel up";
    }
}
