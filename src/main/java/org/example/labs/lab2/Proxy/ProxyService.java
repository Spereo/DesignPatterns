package org.example.labs.lab2.Proxy;

public class ProxyService {
    public void execute() {
        YouTubeVideoDownloader nativeDownloader = new YouTubeVideoDownloader(new ThirdPartyYouTubeApiClient());
        YouTubeVideoDownloader smartDownloader = new YouTubeVideoDownloader(new CacheProxyYouTubeApiClient());

        call(nativeDownloader);
        call(smartDownloader);
    }

    private void call(YouTubeVideoDownloader downloader) {
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervideo");
    }
}
