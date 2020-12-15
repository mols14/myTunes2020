package sample.gui.model;

import sample.bll.LogicFacade;

public class SongModel {

    private LogicFacade lF = new LogicFacade();

    public void playSong(){
       lF.playSong();
    }

    public void addSongFromPath() {
        lF.chooseSongToAdd();}
}
