package sample.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Genre {

    private final int id;
    private final StringProperty genre;

    public Genre(int id, String genre) {
        this.id = id;
        this.genre = new SimpleStringProperty(genre);
    }

    public int getId() { return id; }

    public String getGenre() {
        return genre.get();
    }

    public void setGenre(String genre){ this.genre.set(genre);}
}
