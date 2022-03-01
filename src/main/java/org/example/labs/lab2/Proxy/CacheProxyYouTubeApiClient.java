package org.example.labs.lab2.Proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxyYouTubeApiClient implements YouTubeApiClient {
    private YouTubeApiClient youTubeApiClient;
    private Map<String, Video> cachePopular = new HashMap<String, Video>();
    private Map<String, Video> cacheAll = new HashMap<String, Video>();

    public CacheProxyYouTubeApiClient() { this.youTubeApiClient = new ThirdPartyYouTubeApiClient(); }

    public Map<String, Video> popularVideos() {
        if(cachePopular.isEmpty()) {
            cachePopular = youTubeApiClient.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    public Video getVideo(String videoId) {
        Video video;
        if(!cacheAll.containsKey(videoId)) {
            video = youTubeApiClient.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache");
            video = cacheAll.get(videoId);
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
