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

    public String getStatus() {
        return "------------------------------------" + "\n"
                + "| This is TV set." + "\n"
                + "| TV set is " + (on ? "enabled" : "disabled") + "\n"
                + "| Current volume is " + volume + "%" + "\n"
                + "| Current channel is " + channel + "\n"
                + "------------------------------------" + "\n";
    }
}
