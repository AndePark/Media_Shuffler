package model;

public class Song {

    private String rank;
    private String title;
    private String artist;
    private String year;

    public Song(String rank, String title, String artist, String year) {
        this.rank = rank;
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String display(Song s) {
        String songInfo = rank + title + artist + year;
        return songInfo;
    }
}
