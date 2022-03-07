package org.example.labs.lab2.Proxy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestProxy {
    @Test
    public void testVideo() {
        Video video = new Video("sadgahasgdas", "Catzzzz.avi");
        assertEquals("sadgahasgdas", video.getId());
        assertEquals("Catzzzz.avi", video.getTitle());
        assertEquals("Random video", video.getData());
    }
}
