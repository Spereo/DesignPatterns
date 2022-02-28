package org.example.labs.lab2.Bridge;

public class TV implements Device {
    private boolean on = true;
    private int volume = 30;
    private int channel = 1;

    public boolean isEnabled() { return on; }

    public void enable() { on = true; }
    public void disable() { on = false; }

    public int getVolume() { return volume; }
    public int getChannel() { return channel; }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| This is TV set.");
        System.out.println("| TV set is " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
