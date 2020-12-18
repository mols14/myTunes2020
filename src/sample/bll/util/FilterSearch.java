package sample.bll.util;


import sample.be.Song;

import java.util.ArrayList;
import java.util.List;

public class FilterSearch {


    /**
     * Method to use for the filter/search function of the program.
     * The method creates a List of Song objects and compares them to the user query for title and artist.
     * @param filterBase
     * @param query
     * @return
     */
    public List<Song> filter(List<Song> filterBase, String query){

        List<Song> filterResult = new ArrayList<>();
        for (Song song : filterBase) {
            if(compareToSongTitle(query, song) || compareToSongArtist(query, song)){
                filterResult.add(song);
            }
        }
        return filterResult;
    }

    private boolean compareToSongTitle(String query, Song song) {
        return song.getTitle().toLowerCase().contains(query.toLowerCase());
    }

    private boolean compareToSongArtist(String query, Song song) {
        return song.getArtist().toLowerCase().contains(query.toLowerCase());
    }
}
