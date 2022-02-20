package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
        final String url = "https://en.wikipedia.org/wiki/List_of_most-streamed_songs_on_Spotify";
        Document doc = Jsoup.connect(url).timeout(6000).get();
        Elements table = doc.select("table.wikitable.sortable.jquery-tablesorter");

    }

}
