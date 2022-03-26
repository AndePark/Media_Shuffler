package model;

public class Movie {

    private String title;
    private String yearReleased;
    private String rateBasedOn;


    public Movie(String title, String yearReleased, String rateBasedOn) {
        this.title = title;
        this.yearReleased = yearReleased;
        this.rateBasedOn = rateBasedOn;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getRateBasedOn() {
        return rateBasedOn;
    }

    public void setRateBasedOn(String rateBasedOn) {
        this.rateBasedOn = rateBasedOn;
    }


    public String display(Movie m) {
        String movieInfo = title +  yearReleased +  rateBasedOn;
        return movieInfo;
    }
}
