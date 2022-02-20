package model;

public class Movie {

    private String img;
    private String title;
    private String yearReleased;
    private String rateBasedOn;
    private String rate;

    public Movie(String img, String title, String yearReleased, String rateBasedOn, String rate) {
        this.img = img;
        this.title = title;
        this.yearReleased = yearReleased;
        this.rateBasedOn = rateBasedOn;
        this.rate = rate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
