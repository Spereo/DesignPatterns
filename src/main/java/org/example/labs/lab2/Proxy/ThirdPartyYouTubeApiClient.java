package org.example.labs.lab2.Proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeApiClient implements YouTubeApiClient {
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "...");
        System.out.println("Connected!");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars...");

        HashMap<String, Video> hmap = new HashMap<>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.println("Done!");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video...");
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done!");
        return video;
    }
}
