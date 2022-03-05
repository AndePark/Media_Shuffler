package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SongList {

    private List<Song> songList;


    public SongList() {
        songList = new ArrayList<>();
    }

    public void addSongsList() throws IOException {
        final String url = "https://hiphopgoldenage.com/list/the-best-250-hip-hop-albums-of-all-time/";
        Document doc = Jsoup.connect(url).timeout(6000).get();
        Elements head = doc.select("div.text-wrapper");

        for (Element e : head.select("div")) {
            String title  = e.select("h3");
            System.out.println(title);
        }



    }

}
