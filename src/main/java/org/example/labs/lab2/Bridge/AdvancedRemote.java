package org.example.labs.lab2.Bridge;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) { super.device = device; }

    public String mute() {
        device.setVolume(0);
        return "Remote: mute";
    }
}
