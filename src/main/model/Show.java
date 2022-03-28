package model;

public class Show {

    private String title;
    private String yearReleased;
    private String rateBasedOn;

    public Show(String title, String yearReleased, String rateBasedOn) {

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

    public String display(Show sh) {
        String showInfo = "\nTitle: " + this.title + "\nYear: " + this.yearReleased + "\nRating: " + this.rateBasedOn;
        return showInfo;
    }
}


