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
        final String url = "https://stuarte.co/2021/2021-full-list-rolling-stones-top-500-songs-of-all-time-updated/";
        Document doc = Jsoup.connect(url).timeout(6000).get();
        Elements table =
                doc.select("table.easy-table");

        for (Element e : table.select("tr")) {
            final String rank = e.select("td:nth-of-type(1)").text();

            String title = e.select("td:nth-of-type(2)").text();
            String artist = e.select("td:nth-of-type(3)").text();
            String year = e.select("td:nth-of-type(4)").text();

            songList.add(new Song(rank, title, artist, year));
        }
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }
}
