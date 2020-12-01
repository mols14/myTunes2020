package sample.gui;

import sample.be.Song;

public interface IMytunes {


    /**
     * play/pause the selected song
     * @param song
     *
     */
    void playStop (Song song);

    /**
     * change where to play from. from the currently playing song.
     */

    void songTimerBar(double songTimer);

    /**
     * change the volume of the songs playing from this Application
     */

    void volume(Song song, double volume);

    /**
     * take the input from the searchinput and show the result.
     */

    void searchButtom(String Searchinput);

    /**
     *   close the program
     */

    void closeButtom();


}
