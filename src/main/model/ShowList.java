package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowList {

    private List<Show> showList;

    public ShowList() {
        showList = new ArrayList<>();
    }

    public void addShowsList() throws IOException {
        final String url = "https://www.imdb.com/chart/toptv/";
        Document doc = Jsoup.connect(url).timeout(6000).get();
        Elements body = doc.select("tbody.lister-list");

        for (Element e : body.select("tr")) {
//            String img = e.select("td.posterColumn img").attr("src"); --> image url

            String title = e.select("td.posterColumn img").attr("alt");
//            System.out.println(title);

            String yearReleased = e.select("td.titleColumn span.secondaryInfo")
                    .text().replaceAll("[^\\d]", "");
//             System.out.println(yearReleased);

            String rateBasedOn = e.select("td.ratingColumn.imdbRating strong").attr("title");
//             System.out.println(rateBasedOn);

            showList.add(new Show(title, yearReleased, rateBasedOn));
        }
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
