package sample.be;

public class Song {

    private String title;
    private String artist;
    private final int id;
    private final double time;

    public Song(String title, String artist, int id, double time) {
        this.title = title;
        this.artist = artist;
        this.id = id;
        this.time = time;
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

    public int getId() {
        return id;
    }

    public double getTime() {
        return time;
    }
}
