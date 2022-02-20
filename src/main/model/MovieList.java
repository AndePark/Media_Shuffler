package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieList {

    private List<Movie> movieList;

    public MovieList() {
        movieList = new ArrayList<>();
    }

    public void addMoviesList() throws IOException {
        final String url = "https://www.imdb.com/chart/top/";
        Document doc = Jsoup.connect(url).timeout(6000).get();
        Elements body = doc.select("tbody.lister-list");

        //System.out.println(body.select("tr").size());

        for (Element e : body.select("tr")) {
            String img = e.select("td.posterColumn img").attr("src");
            //System.out.println(img);

            String title = e.select("td.posterColumn img").attr("alt");
            //System.out.println(title);

            String yearReleased = e.select("td.titleColumn span.secondaryInfo")
                    .text().replaceAll("[^\\d]", "");
            // System.out.println(yearReleased);

            String rateBasedOn = e.select("td.ratingColumn strong").attr("title");
            // System.out.println(rateBasedOn);

            String rate = e.select("td.ratingColumn.imdbRating").text().trim();
            // System.out.println(rate);


            movieList.add(new Movie(img, title, yearReleased, rateBasedOn, rate));
         }
        }




    public Movie get(int index) {
        return movieList.get(index);
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public int size() {
        return movieList.size();
    }
}
