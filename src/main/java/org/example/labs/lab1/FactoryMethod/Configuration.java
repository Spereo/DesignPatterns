package org.example.labs.lab1.FactoryMethod;

public class Configuration {
    private int platform;

    public Configuration setPlatform(int platform) {
        this.platform = platform;
        return this;
    }

    public final static int WEB = 1;
    public final static int MOB = 2;

    public int getPlatform() {
        return platform;
    }

    public static Configuration initWeb() {
        return new Configuration().setPlatform(WEB);
    }

    public static Configuration initMob() {
        return new Configuration().setPlatform(MOB);
    }
}
