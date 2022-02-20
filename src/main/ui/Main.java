package ui;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        MovieList movieList = new MovieList();
//        movieList.addMoviesList();


//        public addSongsList() throws IOException {
            final String url = "https://en.wikipedia.org/wiki/List_of_most-streamed_songs_on_Spotify";
            Document doc = Jsoup.connect(url).timeout(6000).get();
//          Elements table = doc.select("table.wikitable.sortable.jquery-tablesorter tr");
          Elements body = doc.select("table.wikitable.sortable.jquery-tablesorter  tr");

        System.out.println(body.select("tr").size());

//            for (Element row : doc.select("table.wikitable.sortable.jquery-tablesorter:nth-of-type(1) tr")) {
//                String title = row.select("td:nth-of-type(1)").at();
//                System.out.println(title);
//            }

        }


    }

