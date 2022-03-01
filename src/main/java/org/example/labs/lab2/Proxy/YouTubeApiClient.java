package org.example.labs.lab2.Proxy;

import java.util.Map;

public interface YouTubeApiClient {
    Map<String, Video> popularVideos();
    Video getVideo(String videoID);
}
