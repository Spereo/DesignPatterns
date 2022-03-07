package org.example.labs.lab2.Bridge;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestBridge {
    Device device;

    @Test
    public void test() {
        device = new Radio();
        testBasicRemote();
        testAdvancedRemote();
        compareMsgRadio();

        device = new TV();
        testBasicRemote();
        testAdvancedRemote();
        compareMsgTV();
    }

    @Test
    private void testBasicRemote() {
        BasicRemote remote = new BasicRemote(device);

        assertEquals("Remote: power toggle", remote.power());
        remote.power();
        assertEquals("Remote: volume down", remote.volumeDown());
        assertEquals("Remote: volume up", remote.volumeUp());
        assertEquals("Remote: channel down", remote.channelDown());
        assertEquals("Remote: channel up", remote.channelUp());
        device.setVolume(101);
        assertEquals(100, device.getVolume());
        device.setVolume(-1);
        assertEquals(0, device.getVolume());
    }

    @Test
    private void testAdvancedRemote() {
        AdvancedRemote remote = new AdvancedRemote(device);
        assertEquals("Remote: mute", remote.mute());
    }

    @Test
    private void compareMsgRadio() {
        String expectedMessage = "------------------------------------" + "\n"
                + "| This is radio." + "\n"
                + "| Radio is " + (device.isEnabled() ? "enabled" : "disabled") + "\n"
                + "| Current volume is " + device.getVolume() + "%" + "\n"
                + "| Current channel is " + device.getChannel() + "\n"
                + "------------------------------------" + "\n";
        String message = device.getStatus();
        assertEquals(expectedMessage, message);
    }

    @Test
    private void compareMsgTV() {
        String expectedMessage = "------------------------------------" + "\n"
                + "| This is TV set." + "\n"
                + "| TV set is " + (device.isEnabled() ? "enabled" : "disabled") + "\n"
                + "| Current volume is " + device.getVolume() + "%" + "\n"
                + "| Current channel is " + device.getChannel() + "\n"
                + "------------------------------------" + "\n";
        String message = device.getStatus();
        assertEquals(expectedMessage, message);
    }
}
